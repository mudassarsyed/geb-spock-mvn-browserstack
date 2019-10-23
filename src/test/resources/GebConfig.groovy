/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import geb.driver.BrowserStackDriverFactory


        driver = {
            def username = "mudassarsyed2"
            assert username
            def accessKey = "8ZezGR6GyZjP2ZqrXphh"
            assert accessKey
            new BrowserStackDriverFactory().create("", username, accessKey, ['build': 'mudassar', 'browser':'Chrome','os': 'Windows','os_version': '8','browser_version': '77.0','browserstack.local': 'true'])

        }
baseUrl = "http://google.com"
