Feature: Submit a Form

  @WebForm
  Scenario Outline: Submit Web Form
    Given I am on the formy page
    When I enter "<FirstName>" "<LastName>" "<JobTitle>"
    And I click on submit
    Then form completion page should be displayed

    Examples:
      | FirstName | LastName | JobTitle        |
      | Dapshad   | Aposki   | CustomerService |