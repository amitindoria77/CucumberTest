Feature: Test Login

@Regression
Scenario: Testing Login Functionality

 Given user is on login page
 When user enters "amit" and "pass"
 Then user navigated to home page "true"
 And  Cards are displayed
  
@smoke
Scenario: Testing Login Functionality

 Given user is on login page
 When user enters "sumit" and "pass"
 Then user navigated to home page "false"
 And  Cards are displayed
  