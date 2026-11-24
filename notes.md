Active code page: 65001

C:\Users\lzhou\petclinic-e2e>mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen --target java http://localhost:8080"
Picked up JAVA_TOOL_OPTIONS: -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] Loaded 24527 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] ----------------------< petclinic:petclinic-e2e >-----------------------
[INFO] Building petclinic-e2e 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec:3.7.0:java (default-cli) @ petclinic-e2e ---
Error: net::ERR_CONNECTION_REFUSED at http://localhost:8080/
Call log:
  - navigating to "http://localhost:8080/", waiting until "load"


C:\Users\lzhou\petclinic-e2e>mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen --target java http://localhost:8080"
Picked up JAVA_TOOL_OPTIONS: -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] Loaded 24527 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] ----------------------< petclinic:petclinic-e2e >-----------------------
[INFO] Building petclinic-e2e 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- exec:3.7.0:java (default-cli) @ petclinic-e2e ---
Terminate batch job (Y/N)? Y

C:\Users\lzhou\petclinic-e2e>mvn test
Picked up JAVA_TOOL_OPTIONS: -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------------< petclinic:petclinic-e2e >-----------------------
[INFO] Building petclinic-e2e 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] Loaded 24527 auto-discovered prefixes for remote repository central (prefixes-central.txt)
[INFO] 
[INFO] --- resources:3.5.0:resources (default-resources) @ petclinic-e2e ---
[INFO] skip non existing resourceDirectory C:\Users\lzhou\petclinic-e2e\src\main\resources
[INFO] 
[INFO] --- compiler:3.16.0:compile (default-compile) @ petclinic-e2e ---
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.6.0/plexus-java-1.6.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.17.0/plexus-compiler-javac-2.17.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.17.0/plexus-compiler-api-2.17.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.17.0/plexus-compiler-manager-2.17.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.17.0/plexus-compiler-api-2.17.0.pom (1.6 kB at 1.1 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.17.0/plexus-compiler-javac-2.17.0.pom (1.6 kB at 1.0 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.6.0/plexus-java-1.6.0.pom (4.1 kB at 2.7 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.17.0/plexus-compiler-manager-2.17.0.pom (1.8 kB at 1.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/1.6.0/plexus-languages-1.6.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.17.0/plexus-compiler-2.17.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/1.6.0/plexus-languages-1.6.0.pom (3.8 kB at 20 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.17.0/plexus-compiler-2.17.0.pom (6.9 kB at 40 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/github/javaparser/javaparser-core/3.28.2/javaparser-core-3.28.2.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.17.0/plexus-compilers-2.17.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.17.0/plexus-compilers-2.17.0.pom (1.3 kB at 17 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/javaparser/javaparser-core/3.28.2/javaparser-core-3.28.2.pom (5.0 kB at 65 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/github/javaparser/javaparser-parent/3.28.2/javaparser-parent-3.28.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/javaparser/javaparser-parent/3.28.2/javaparser-parent-3.28.2.pom (26 kB at 676 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.6.0/plexus-java-1.6.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.6.0/plexus-java-1.6.0.jar (58 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.17.0/plexus-compiler-api-2.17.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.17.0/plexus-compiler-manager-2.17.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.17.0/plexus-compiler-javac-2.17.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/github/javaparser/javaparser-core/3.28.2/javaparser-core-3.28.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.17.0/plexus-compiler-javac-2.17.0.jar (31 kB at 809 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.17.0/plexus-compiler-manager-2.17.0.jar (5.4 kB at 129 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.17.0/plexus-compiler-api-2.17.0.jar (29 kB at 504 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/javaparser/javaparser-core/3.28.2/javaparser-core-3.28.2.jar (1.5 MB at 11 MB/s)
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.5.0:testResources (default-testResources) @ petclinic-e2e ---
[INFO] skip non existing resourceDirectory C:\Users\lzhou\petclinic-e2e\src\test\resources
[INFO] 
[INFO] --- compiler:3.16.0:testCompile (default-testCompile) @ petclinic-e2e ---
[INFO] Recompiling the module because of added or removed source files.
[INFO] Compiling 4 source files with javac [debug target 17] to target\test-classes
[WARNING] location of system modules is not set in conjunction with -source 17
  not setting the location of system modules may lead to class files that cannot run on JDK 17
    --release 17 is recommended instead of -source 17 -target 17 because it sets the location of system modules automatically
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ petclinic-e2e ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.pom (6.2 kB at 99 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.pom (4.5 kB at 24 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.pom (3.5 kB at 19 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.pom (3.3 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.pom (4.1 kB at 49 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.pom (3.3 kB at 51 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.pom (1.8 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.jar (308 kB at 4.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.jar (14 kB at 412 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.jar (26 kB at 479 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.15.1/commons-io-2.15.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.jar (118 kB at 1.4 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.jar (8.2 kB at 94 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.jar (171 kB at 646 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.15.1/commons-io-2.15.1.jar (501 kB at 1.9 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.jar (2.4 MB at 9.2 MB/s)
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.pom (4.7 kB at 80 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/3.2.5/surefire-providers-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/3.2.5/surefire-providers-3.2.5.pom (2.6 kB at 54 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.pom (3.0 kB at 84 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.pom (2.8 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.pom (3.2 kB at 84 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.pom (2.8 kB at 81 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom (1.7 kB at 38 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.jar (27 kB at 754 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.jar (18 kB at 488 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar (7.7 kB at 196 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar (169 kB at 3.1 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar (103 kB at 1.9 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar (189 kB at 3.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.pom (3.0 kB at 50 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.jar (184 kB at 2.6 MB/s)
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
Picked up JAVA_TOOL_OPTIONS: -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
[INFO] Running petclinic.FindOwnerTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.906 s -- in petclinic.FindOwnerTest
[INFO] Running petclinic.OwnerTest
[ERROR] Tests run: 2, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 32.51 s <<< FAILURE! -- in petclinic.OwnerTest
[ERROR] petclinic.OwnerTest.findOwner_noMatch_showsNotFound -- Time elapsed: 30.47 s <<< ERROR!
com.microsoft.playwright.TimeoutError: 
Error {
  message='Timeout 30000ms exceeded.
  name='TimeoutError
  stack='TimeoutError: Timeout 30000ms exceeded.
    at ProgressController.run (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\progress.js:75:26)
    at Frame.fill (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\frames.js:1072:23)
    at FrameDispatcher.fill (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\frameDispatcher.js:170:30)
    at FrameDispatcher._handleCommand (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\dispatcher.js:94:40)
    at DispatcherConnection.dispatch (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\dispatcher.js:361:39)
}
Call log:
-   - waiting for getByLabel("Last Name")

        at com.microsoft.playwright.impl.WaitableResult.get(WaitableResult.java:52)
        at com.microsoft.playwright.impl.ChannelOwner.runUntil(ChannelOwner.java:132)
        at com.microsoft.playwright.impl.Connection.sendMessage(Connection.java:130)
        at com.microsoft.playwright.impl.ChannelOwner.sendMessage(ChannelOwner.java:118)
        at com.microsoft.playwright.impl.FrameImpl.fillImpl(FrameImpl.java:335)
        at com.microsoft.playwright.impl.FrameImpl.lambda$fill$14(FrameImpl.java:325)
        at com.microsoft.playwright.impl.LoggingSupport.lambda$withLogging$0(LoggingSupport.java:36)
        at com.microsoft.playwright.impl.LoggingSupport.withLogging(LoggingSupport.java:47)
        at com.microsoft.playwright.impl.ChannelOwner.withLogging(ChannelOwner.java:97)
        at com.microsoft.playwright.impl.LoggingSupport.withLogging(LoggingSupport.java:35)
        at com.microsoft.playwright.impl.FrameImpl.fill(FrameImpl.java:325)
        at com.microsoft.playwright.impl.LocatorImpl.fill(LocatorImpl.java:250)
        at com.microsoft.playwright.Locator.fill(Locator.java:3075)
        at petclinic.OwnerTest.findOwner_noMatch_showsNotFound(OwnerTest.java:24)
        at java.base/java.lang.reflect.Method.invoke(Method.java:583)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
Caused by: com.microsoft.playwright.TimeoutError: Error {
  message='Timeout 30000ms exceeded.
  name='TimeoutError
  stack='TimeoutError: Timeout 30000ms exceeded.
    at ProgressController.run (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\progress.js:75:26)
    at Frame.fill (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\frames.js:1072:23)
    at FrameDispatcher.fill (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\frameDispatcher.js:170:30)
    at FrameDispatcher._handleCommand (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\dispatcher.js:94:40)
    at DispatcherConnection.dispatch (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\dispatcher.js:361:39)
}
Call log:
-   - waiting for getByLabel("Last Name")

        at com.microsoft.playwright.impl.Connection.dispatch(Connection.java:254)
        at com.microsoft.playwright.impl.Connection.processOneMessage(Connection.java:211)
        at com.microsoft.playwright.impl.ChannelOwner.runUntil(ChannelOwner.java:130)
        ... 15 more

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   OwnerTest.findOwner_noMatch_showsNotFound:24 » Timeout Error {
  message='Timeout 30000ms exceeded.
  name='TimeoutError
  stack='TimeoutError: Timeout 30000ms exceeded.
    at ProgressController.run (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\progress.js:75:26)
    at Frame.fill (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\frames.js:1072:23)
    at FrameDispatcher.fill (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\frameDispatcher.js:170:30)
    at FrameDispatcher._handleCommand (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\dispatcher.js:94:40)
    at DispatcherConnection.dispatch (C:\Users\lzhou\AppData\Local\Temp\playwright-java-7832998379298149589\package\lib\server\dispatchers\dispatcher.js:361:39)
}
Call log:
-   - waiting for getByLabel("Last Name")

[INFO] 
[ERROR] Tests run: 3, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[ERROR] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  45.039 s
[INFO] Finished at: 2026-11-17T13:37:24-06:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test (default-test) on project petclinic-e2e: 
[ERROR] 
[ERROR] Please refer to C:\Users\lzhou\petclinic-e2e\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

C:\Users\lzhou\petclinic-e2e>git init
Initialized empty Git repository in C:/Users/lzhou/petclinic-e2e/.git/

C:\Users\lzhou\petclinic-e2e>