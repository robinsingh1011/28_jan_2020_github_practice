Feature: Login Action

Scenario: Successfull Login with Valid Credentials
  Given User is on Home Page
  When User Navigate to LogIn Page
  And User enters Username and Password
  Then Message dsiplayed login Successfully
  
  Scenario: Successful Logout
  When User Logout from the Application
  Then Message displayed Logout Seccessfully