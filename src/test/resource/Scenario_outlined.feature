@smoke1
Feature: Login feature

  Scenario Outline: Login Test happy path

    When enter username as <username>
    And enter password as <password>

    Examples:
    |username| |password|
    |"Test1"   | |"test2"    |
    |"test3"   | |"test4"    |


