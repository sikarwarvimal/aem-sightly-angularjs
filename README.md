AEM Sightly Example


Building
--------

This project uses Gradle(http://gradle.org/) as build tool, TWC CQ Gradle Package Plugin(https://github.com/TWCable/gradle-plugin-cq-package) to create a package and TWC CQ Gradle Bundle Plugin(https://github.com/TWCable/gradle-plugin-cq-bundle) to create bundles.

Running `install` task will the created bundles/packages and deploy on Author(4502) and Publish(4503) ports if they are running.

**Build Plugin project**
-> ./gradlew clean install

