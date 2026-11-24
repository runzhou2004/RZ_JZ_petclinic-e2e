# Spring PetClinic Playwright evaluation

This repository contains Java Playwright end-to-end tests for Spring PetClinic. The suite covers owner search and validation, adding an owner and pet, scheduling a visit, the veterinarian directory, and an HTTP smoke check using Playwright's API request client.

## Run locally

Requirements: Java 17, Maven, and a running Spring PetClinic on port 8080.

From this repository, install the browser once and run the tests:

```powershell
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install chromium"
mvn test
```

To use a different app URL:

```powershell
mvn "-Dpetclinic.baseUrl=http://localhost:8080" test
```

Each test has an isolated browser context. Traces are written to `traces/` and overwritten by the same test on its next run. Use Playwright Trace Viewer to inspect a trace:

```powershell
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="show-trace traces/addOwner_showsOwnerInformation.zip"
```

To explore a flow with codegen, first start PetClinic and run:

```powershell
mvn exec:java -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="codegen --target java http://localhost:8080"
```

Generated code is a starting point: add outcome assertions, extract repeated steps, and remove actions that aren't part of the scenario before using it as a test. `src/test/java/petclinic/Example.java` is the exploratory recording kept with this study.

## Repeated-run reliability and duration

With PetClinic running and reachable, collect 20 suite runs by default:

```powershell
./scripts/run-repeated.ps1
```

Choose a count or URL with `./scripts/run-repeated.ps1 -Runs 30 -BaseUrl http://localhost:8080`. The script records UTC time, E2E repository revision, suite pass/fail, and total Maven run duration in `results/repeated-runs.csv`; it prints the pass rate and median duration. Each run includes Maven startup, so compare runs collected on the same machine and setup. Results are overwritten for a fresh experiment.

## Study design notes

- `mvn test` runs only this browser/API suite. The PetClinic JUnit suite is in the separate `spring-petclinic` repository; record the exact PetClinic commit for every comparison.
- PetClinic's pages are server-rendered MVC pages; this project does not assume there is a dedicated JSON REST API. `ApiSmokeTest` demonstrates Playwright's API request client against an HTTP route and is not counted as a UI workflow test.
- GitHub Actions checks out the upstream PetClinic `main` branch and uploads Surefire reports, traces, and the application log. Record the checked-out PetClinic SHA from the workflow output when citing a run; pin `ref` to a commit for a fixed experiment.
- Codegen is useful for discovering selectors and workflows, but generated scripts need cleanup, assertions, and test-data isolation before they are suitable for the suite. `Example.java` is retained as the exploratory capture.
- For the coverage comparison, instrument the PetClinic application with the same JaCoCo configuration in both conditions: existing JUnit suite alone, then JUnit plus browser tests while the instrumented app is running. Do not compare test-source coverage; report application line and branch coverage.
- For bug detection, prepare and document seeded defects separately from production bug findings. Record for each defect whether JUnit, Playwright, both, or neither detected it.

## Study dimensions to record

| Dimension | Evidence |
| --- | --- |
| Setup and learning effort | Time log for installation, first passing test, and later maintenance; Java/Maven/Playwright/browser versions |
| Reliability | Repeated run pass rate, failures, environment exclusions, and run count |
| Execution time | Total suite duration; report cold startup separately if measured |
| Debugging and maintenance | A real failure trace review, codegen cleanup effort, and CI artifact usefulness |
| Added value over JUnit | Application coverage with and without E2E plus seeded-defect detection matrix |

Don't invent or infer experimental values. Collect the evidence first, then use it to write conclusions about when Playwright fits.
