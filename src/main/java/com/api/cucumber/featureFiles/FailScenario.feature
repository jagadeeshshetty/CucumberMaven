@all @failScenarios
Feature: Fail scenarios

  @arithmeticExceptionFail
  Scenario: Fail by ArithmeticException
    When I try to divide number by zero