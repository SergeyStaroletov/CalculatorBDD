Feature: Addition
  In order to avoid using + - / *
  As a math idiot
  I want to create a software calculator

  Scenario:
    Given I have my software calculator
    When I have entered 10 as first operand
    And I have entered 20 as second operand
    And I press 'Add'
    Then The result should be 30

  Scenario:
    Given I have my software calculator
    When I have entered 5 as first operand
    And I have entered 10 as second operand
    And I press 'Add'
    Then The result should be 15
  Scenario:
    Given I have my software calculator
    When I have entered 5 as first operand
    And I have entered 10 as second operand
    And I press 'Multiply'
    Then The result should be 50
  Scenario:
    Given I have my software calculator
    When I have entered 5 as first operand
    And I have entered 0 as second operand
    And I press 'Multiply'
    Then The result should be 0