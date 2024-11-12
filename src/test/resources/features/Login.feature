@login @regression
Feature: Login to the app

  Background:
    Given I access to the login page

  @valid-login
  Scenario Outline: Login through the login portal
    When I enter a username <username>
    And  I enter a password "<password>"
    And I click on login button
    Then I verify the alert popup shows a message indicating "<validationMessage>"

    Examples:
    | username | password | validationMessage |
    | webdriver | webdriver123 | validation succeeded |
    | webdriver | webdriver1   | validation failed    |