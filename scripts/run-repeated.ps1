param(
    [ValidateRange(1, 1000)]
    [int]$Runs = 20,
    [string]$BaseUrl = "http://localhost:8080"
)

$ErrorActionPreference = "Stop"
$repoRoot = Split-Path -Parent $PSScriptRoot
$resultsDir = Join-Path $repoRoot "results"
$csvPath = Join-Path $resultsDir "repeated-runs.csv"
New-Item -ItemType Directory -Path $resultsDir -Force | Out-Null

if (-not (Test-NetConnection -ComputerName ([uri]$BaseUrl).Host -Port ([uri]$BaseUrl).Port -InformationLevel Quiet)) {
    throw "PetClinic is not reachable at $BaseUrl. Start it before collecting repeated-run data."
}

$revision = (& git -C $repoRoot rev-parse --short HEAD).Trim()
$rows = [System.Collections.Generic.List[object]]::new()
for ($run = 1; $run -le $Runs; $run++) {
    $timer = [System.Diagnostics.Stopwatch]::StartNew()
    & mvn -B "-Dpetclinic.baseUrl=$BaseUrl" test
    $exitCode = $LASTEXITCODE
    $timer.Stop()

    $rows.Add([pscustomobject]@{
        timestamp = (Get-Date).ToUniversalTime().ToString("o")
        run = $run
        revision = $revision
        passed = ($exitCode -eq 0)
        exit_code = $exitCode
        duration_seconds = [math]::Round($timer.Elapsed.TotalSeconds, 2)
    })

    $rows | Export-Csv -LiteralPath $csvPath -NoTypeInformation
    Write-Host "Run $run/$Runs`: exit=$exitCode, duration=$([math]::Round($timer.Elapsed.TotalSeconds, 2))s"
}

$passCount = @($rows | Where-Object passed).Count
$durations = @($rows | Select-Object -ExpandProperty duration_seconds | Sort-Object)
if ($durations.Count % 2 -eq 0) {
    $median = ($durations[$durations.Count / 2 - 1] + $durations[$durations.Count / 2]) / 2
} else {
    $median = $durations[[math]::Floor($durations.Count / 2)]
}
Write-Host "Pass rate: $passCount/$Runs ($([math]::Round(100 * $passCount / $Runs, 1))%)"
Write-Host "Median run duration: $median seconds"
Write-Host "Run data saved to $csvPath"

if ($passCount -ne $Runs) { exit 1 }
