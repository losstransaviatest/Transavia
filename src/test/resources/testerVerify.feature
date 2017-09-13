Feature: Check existence of booking possibilities
  
  
 As Tester I want to make sure that i am on the right home page and that 
 User can search and book based on Departure and Arrival airports

  Scenario: Confirm you are on the correct page and booking options exists
    Given I Navigate to Transavia Website
    When I confirm the existence of the input fields
    And  click on SearchButton
    Then I should be redirect to Book a flight page
   