Feature: user can choose and add to cart
  @smoke
  Scenario: valid add to cart
    Given home page appear user click on Signup login
    When user enter Email address and password
    And user click on login button
    Then user name appear and user can login sucess
    Given Home page appear and user click on product page
    When user click on view product
    Then user click on add to cart