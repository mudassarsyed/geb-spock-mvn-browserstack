/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import geb.driver.BrowserStackDriverFactory
def browserStackBrowser = System.getProperty("browser")
switch(browserStackBrowser)
{
case "ff" :
driver = {
    def username = System.getenv("BROWSERSTACK_USERNAME")
    assert username
    def accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY")
    assert accessKey
    def browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
    def browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
    new BrowserStackDriverFactory().create(username, accessKey,['build': 'Geb-Spock-Mvn-Test','name' : 'single', 'browser':'firefox','os': 'Windows','os_version': '8','browser_version': '69','browserstack.local': 'false',"browserstack.localIdentifier":browserstackLocalIdentifier])
}
   break
case "chrome" :
driver = {
    def username = System.getenv("BROWSERSTACK_USERNAME")
    assert username
    def accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY")
    assert accessKey
    def browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
    def browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
    new BrowserStackDriverFactory().create(username, accessKey,['build': 'Geb-Spock-Mvn-Test','name' : 'single', 'browser':'chrome','os': 'Windows','os_version': '8','browser_version': '76','browserstack.local': 'false',"browserstack.localIdentifier":browserstackLocalIdentifier])
}
    break
case "local" :
driver = {
    def username = System.getenv("BROWSERSTACK_USERNAME")
    assert username
    def accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY")
    assert accessKey
    def browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
    def browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
    new BrowserStackDriverFactory().create(username, accessKey,['build': 'Geb-Spock-Mvn-Test','name' : 'local', 'browser':'chrome','os': 'Windows','os_version': '8','browser_version': '76','browserstack.local': 'true',"browserstack.localIdentifier":browserstackLocalIdentifier])
}
    break
}

baseUrl = "http://google.com"
