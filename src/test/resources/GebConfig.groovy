/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import geb.driver.BrowserStackDriverFactory
def chrome = '[\'build\': \'mudassar\', \'browser\':\'Chrome\',\'os\': \'Windows\',\'os_version\': \'8\',\'browser_version\': \'77.0\',\'browserstack.local\': browserstackLocal,"browserstack.localIdentifier":browserstackLocalIdentifier]'


        driver = {
            def username = System.getenv("BROWSERSTACK_USERNAME")
            assert username
            def accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY")
            assert accessKey
	def browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
	def browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
            new BrowserStackDriverFactory().create("", username, accessKey, chrome)

        }
baseUrl = "http://google.com"
