Feature: user can choose and add to cart
  @smo
  Scenario: valid add to cart
    Given home page appear user click on Signup login
    When user enter Email address and password
    And user click on login button
    Then user name appear and user can login sucess
    Given Home page appear and user click on product page
    When user click on view product
    Then user click on add to cart
    Given user click on cart
    When user click on proceed to chekout
    And user click on place order
    Then user enter payment data1
    And user enter payment data2
    And user enter payment data3
    And user enter payment data4
    And user enter payment data5
    And user enter payment data6