# Geb-Spock-BrowserStack with Maven

[Geb](https://gebish.org) and Spock Integration with BrowserStack.

![BrowserStack Logo](https://d98b8t1nnulk5.cloudfront.net/production/images/layout/logo-header.png?1469004780)

## Setup

* Clone the repo
* Install dependencies `mvn compile`
* Update `GebConfig.groovy` file inside the `gebspock/src/test/resources` directory with your [BrowserStack Username and Access Key](https://www.browserstack.com/accounts/settings)
* Update `GebConfig.groovy` file inside the `gebspock/src/test/resources` directory with your browser profile by defining the [required capabilities](https://www.browserstack.com/automate/capabilities)
* Local Testing is turned on by Default in this repo and will require the BrowserStack Local Binary to be started before the test incase test is triggered locally
* To turn off Local Testing set browserstack.local:false

## Running your tests

- To run a single test, run `mvn test -e -Dbrowser=<browser profile set in GebConfig.groovy> -P single`
- To run local tests, run `mvn test -e -Dbrowser=<browser profile set in GebConfig.groovy> -P local`
- To run parallel tests, run `mvn test -e -Dbrowser=<browser profile set in GebConfig.groovy> -P parallel`

 Understand how many parallel sessions you need by using our [Parallel Test Calculator](https://www.browserstack.com/automate/parallel-calculator?ref=github)


## Notes
* You can view your test results on the [BrowserStack Automate dashboard](https://www.browserstack.com/automate)
* You can export the environment variables for the Username and Access Key of your BrowserStack account

  ```
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```
## Additional Resources
* [Customizing your tests on BrowserStack](https://www.browserstack.com/automate/capabilities)
* [Browsers & mobile devices for selenium testing on BrowserStack](https://www.browserstack.com/list-of-browsers-and-platforms?product=automate)
* [Using REST API to access information about your tests via the command-line interface](https://www.browserstack.com/automate/rest-api)
