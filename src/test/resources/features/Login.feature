#language:en
Feature: Success and exception scenarios for login functionality

  @test
  Scenario Outline: Successful login
    Given I have valid login credentials "<email>" "<password>"
    When I click on the confirm login button
    Then I confirm stores on the home screen

    Examples:
      | email           | password |
      | teste@teste.com | 123456   |