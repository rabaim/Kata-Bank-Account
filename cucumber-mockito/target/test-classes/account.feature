#Author: your.email@your.domain.com
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
@tag
Feature: Bank Account
  This feature describe all bank Account requirements

  @tag1
  Scenario: I check my operations
    Given I make a deposit of 100 on "06/09/2018"
    And a deposit of 200 on "07/09/2018"
    And a withdrawal of 50 on "10/09/2018"
    When I print my bank statement
    Then I should see my history
