# CucumberJavaBoilerplate

####This is a base project structure to start using Cucumber/Junit and Maven with Selenium 3.0.1
######This project uses example website as cleartrip.com

#####To run the tests:
* Clone the repo
* Update the chromedrive path in src/test/features/steps/DriverHooks.java file
* Run the commands: 

        mvn compile && mvn test

* The generated test reports can be found in reports/
* Screenshots can be found in reports/screenshots
* Screenshots are captured only when there is a failure in scenario
    
