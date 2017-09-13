Feature: CustomerLogin
  
 As a loyal customer I should be able to log into myTransavia in order to track my clients related informations 
 and logout succesfully for security reasons. 
 
    
Scenario: A Successful Login 
Given Customer is on Transavia Home page
When Customer Navigate to LogIn Page
And Customer enters 'UserName' and 'Password'
Then Message displayed Login Successfully
 
Scenario: A Successful LogOut
When Customer Click on LogOut button
Then Customer should get Successful Logout confirmation message