import geb.spock.GebSpec

class GebishOrg1Spec extends GebSpec {

    def "Search BrowserStack on Google"() {
        when:
        to GebishOrgHomePage

        and:
        q = "BrowserStack"

        then:
        waitFor { at TheBookOfGebPage }

        //and:
        //firstResultLink.text() == "Wikipedia"

        //when:
        //firstResultLink.click()

        //then:
        //waitFor { at WikipediaPage }
    }
}
