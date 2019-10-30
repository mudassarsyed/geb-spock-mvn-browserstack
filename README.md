# BrowserStack Example Geb and Spock Maven Project


## Description

This is a simple example project for using Geb with Maven to run tests on BrowserStack.

## Usage

Update your BrowserStack Username and Password in GebConfig.groovy file and mention the capabilities

Just check it out and run…

    mvn test
    
To run Tests in Parallel…

    mvn test Dbrowser=<browser_profile_specified_in_GebConfig.groovy file>

## No of Paralell Threads

If you want to configure the number os parallel threads, you can mention the same in the <configuration> tag in the POM.xml

Push code using  git push -u splash master
