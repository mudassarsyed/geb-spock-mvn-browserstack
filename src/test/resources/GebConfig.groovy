/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import geb.driver.BrowserStackDriverFactory
driver = {
    def username = System.getenv("BROWSERSTACK_USERNAME")
    assert username
    def accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY")
    assert accessKey
    def browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
    def browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
    new BrowserStackDriverFactory().create(username, accessKey,['build': 'mudassar', 'browser':'firefox','os': 'Windows','os_version': '8','browser_version': '69','browserstack.local': browserstackLocal,"browserstack.localIdentifier":browserstackLocalIdentifier])

}
baseUrl = "http://google.com"
