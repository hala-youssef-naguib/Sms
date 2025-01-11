Feature: user can login
  @smoke
  Scenario: valid login
    Given home page appear user click on Signup login
    When user enter Email address and password
    And user click on login button
    Then user name appear and user can login sucess

    Scenario Outline: Invalid Login
      Given home page appear user click on Signup login
      When user enter "<Email>" address and "<password>"
      And user click on login button

      Examples:
      | Email                  |  password     |
      |   aaaaaaaadhhwwhhhhhh@gmail.com    |   0281928189 |
