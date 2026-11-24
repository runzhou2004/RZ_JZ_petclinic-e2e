# Coverage and seeded-defect protocol

## Freeze the comparison conditions

Record the exact PetClinic commit, the E2E commit, Java and Maven versions, OS, database/profile, and commands for every condition. Use the same application revision and configuration throughout. Start from a clean PetClinic checkout or reset its working tree between conditions.

## JUnit-only baseline

From the PetClinic repository, run its normal test command (for example, `./mvnw clean verify` or `mvn clean verify`, depending on the wrapper available). Save the Surefire reports and JaCoCo XML/HTML report. Confirm the JaCoCo agent is active and record the report path and covered source scope. This condition measures the existing in-process suite.

## JUnit plus browser tests

The application needs JaCoCo instrumentation while it is serving browser requests; running the E2E tests in this separate repository does not instrument PetClinic by itself. Build PetClinic, start the packaged application with the matching JaCoCo Java agent writing a separate execution file (for example `jacoco-e2e.exec`), run the browser suite, then stop the server cleanly so the agent flushes its data. Generate a JaCoCo report against the same PetClinic classes and source files. Merge the JUnit and E2E execution data with JaCoCo's `merge` goal before producing the combined report. Keep the raw `.exec` files and reports for both conditions.

Use the same JaCoCo version in both conditions. Check that the class files used to generate the report are exactly those that ran in the instrumented application; mismatched class files make coverage results invalid. Compare application code only, not E2E test code. Report line and branch coverage, plus the absolute percentage-point change.

If the PetClinic build's built-in report is used for the JUnit condition, verify what its JaCoCo executions include. A clean verify may execute integration tests or container-backed tests depending on profiles and environment; document exclusions and do not compare different test scopes unknowingly.

## Seeded-defect experiment

Create one isolated copy or branch per defect. Keep each defect small, reproducible, and limited to a behavior covered by the agreed flows (for example, suppressing an owner search result, rejecting a valid pet type, or failing to persist a visit description). Do not combine defects. For each one:

1. Save the defect patch and a short expected-behavior description.
2. Run the PetClinic JUnit suite and record whether it fails.
3. Reset to the exact same defective revision and run Playwright, recording whether it fails.
4. Verify that each suite passes on the unmodified baseline.
5. Record the failing assertion or error and classify detection as JUnit, Playwright, both, or neither.

Do not describe seeded-defect detection as bugs found in upstream PetClinic. Present it as a controlled sensitivity experiment and discuss the limited number and selection of defects.

## Data templates

`activity-log.csv` tracks setup and maintenance effort. `seeded-defects.csv` tracks the controlled defect experiment. Keep raw reports and logs in a dated experiment folder rather than copying only summary percentages into the paper.
