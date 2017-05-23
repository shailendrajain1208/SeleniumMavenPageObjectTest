@smoke
Feature: To Test the High level functionality of Website

  Background: 
    Given I am on the website page

  Scenario: To Populate the Contact Page
    When I click on "Contact"
    And I enter "name test" into name field
    And I enter "Address test" into address field
    And I enter "Postal Code" into postal field
    And I enter "Email Address" into Email field
    And I submit the form
    Then I check i am on conformation page
    And I close the browser




    
    
