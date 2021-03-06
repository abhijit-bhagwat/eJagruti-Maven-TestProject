#Author: amolabhi@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@SmokeTest
Feature: Login feature
  I want to use this template for my feature file
	
	Background: User is succcessfully access the URL
	When user opens Chrome browser
	And user enters the URL "http://192.168.0.222:90/finsys"
	
  @LoginWithInvalidCredentials
  Scenario: Login Functionality for invalid username and invalid password
    Given User is on the application login page
    When user enters "dummyfm%$#" as username
    And user enters "Password@#!" as password
    And user clicks on login button
    Then error message "Please Enter Valid Username or Password!!!" displays at the bottom

  @LoginWithValidCredentials
  Scenario: Login Functionality for valid username and valid password
    Given User is on the application login page
    When user enters "dummyfm" as username
    And user enters "passw0rd" as password
    And user clicks on login button
    Then user redirected to homepage where message starting with "Welcome dummy[FM]" is displayed on the top

    