Feature: Correct the Inbound flight date in the past
  
  As potential passenger, when by mistake my Inbound flight date is before Outbound flight date, I should be required to correct it as this is not possible

  Scenario Outline: Not possible to have Inbound flight in the past
    Given I Navigate to Transavia Website
    When I enter <Departure> and <Arrival> and <Outbounddate> and <Inbounddate>
    And click on SearchButton
    Then I should be required to update the dates in case <Inbounddate> is before <Outbounddate>

    Examples: 
      | Departure                         | | Arrival         |  | Outbounddate |  | Inbounddate |
      | Amsterdam (Schiphol), Netherlands | | Agadir, Morocco |  | 20 Sep 2017  |  | 10 Sep 2017 |
