@contact-us @regression
Feature: WebDriver University - Contact Us Page

  Scenario: Validate Successful Submission - Unique Data
    Given I access the webdriver university contact us page
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message

  @specific
  Scenario: Validate Successful Submission - Specific Data
    Given I access the webdriver university contact us page
    When I enter a specific first name Martin
    And I enter a specific last name Lescano
    And I enter a specific email address mltest@mail.com
    And I enter a specific comment "How are you"
    And I click on the submit button
    Then I should be presented with a successful contact us submission message