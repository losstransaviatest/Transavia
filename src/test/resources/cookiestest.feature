Feature: Check cookies pop-up
  
  
 As User If cookies pop-up appears and I accept it, then it disappers.

  Scenario: Check cookies pop-up
    Given I Navigate to Transavia Website
    When  cookies pop-up appears and I accept it
    Then  cookies pop-up disappears
   