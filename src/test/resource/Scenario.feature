@smoke1
Feature: To test the high level functionality of an website

  Background:
    Given I am on the Website page

  Scenario: To populate the Contact Page
    When I click on contact link
    Then contact page is displayed

  Scenario: To fill data in the form
    When I enter first name
    And i enter last name
    Then click on submit button



