# SMS Project - Test Automation with Cucumber and Selenium

This project is an automation framework for testing the SMS application. It leverages Selenium, Cucumber, and TestNG for functional and regression testing. The tests are structured around user scenarios in the context of an e-commerce platform where users can log in, browse products, add them to the cart, and proceed to checkout.

## Technologies Used

- **Selenium**: WebDriver for automating browser actions.
- **Cucumber**: Behavior Driven Development (BDD) framework for defining test scenarios.
- **TestNG**: Testing framework for running tests in parallel and generating reports.
- **ExtentReports**: Reporting tool for visualizing test execution and results.

## Project Setup

### Prerequisites

- Java 23 or higher
- Apache Maven
- An IDE like IntelliJ IDEA or Eclipse

### How to Set Up

1. Clone the repository to your local machine:
   ```bash
   git clone https://your-repo-url.git
   ```

2. Navigate to the project folder:
   ```bash
   cd Sms
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Ensure all dependencies are installed, including Selenium, Cucumber, TestNG, and ExtentReports.

## Test Scenarios

### Feature: User Can Choose and Add Products to Cart

The feature is structured with a series of steps that simulate the user journey for logging in, adding products to the cart, and completing the checkout process. Below is the main test scenario that is defined in the `*.feature` file.

```gherkin
Feature: User can choose and add to cart
  @smo
  Scenario: Valid add to cart
    Given home page appear user click on Signup login
    When user enter Email address and password
    And user click on login button
    Then user name appear and user can login successfully

    Given Home page appear and user click on product page
    When user click on view product
    Then user click on add to cart

    Given user click on cart
    When user click on proceed to checkout
    And user click on place order
    Then user enter payment data1
    And user enter payment data2
    And user enter payment data3
    And user enter payment data4
    And user enter payment data5
    And user enter payment data6
```

### Steps Description

- **Given**: Describes the preconditions that need to be met before performing actions, such as user logging in or navigating to the product page.
- **When**: Represents the actions taken by the user, like clicking on buttons or entering data.
- **Then**: Describes the expected outcomes or verifications that should happen after actions are performed.

### Features of the Test Suite
- **Scenario Execution**: Automates the login process, product selection, and checkout flow.
- **Parameterization**: Uses Cucumber’s ability to handle parameters (e.g., payment data) to ensure different inputs are tested.
- **Test Reporting**: Uses ExtentReports to generate detailed test execution reports for analysis.

## Dependencies

Here are the key dependencies used in the project as defined in the `pom.xml`:

- **Selenium Java**: Version 4.27.0 for browser automation.
- **TestNG**: Version 7.10.2 for running and reporting the tests.
- **Cucumber**: Version 7.20.1 for BDD-style scenario definitions.
- **Cucumber TestNG**: To integrate Cucumber with TestNG for running tests.
- **ExtentReports**: Version 1.14.0 for generating reports on test execution.

## Running the Tests

You can run the tests using Maven or directly from your IDE.

### Using Maven

Run the tests with the following Maven command:
```bash
mvn test
```

This will execute all the tests defined in the `src/test/java` folder and generate reports via ExtentReports.

### Using IntelliJ or Eclipse

You can also run the tests directly from your IDE by executing the TestNG suite or running the Cucumber tests.

## Reporting

The ExtentReports tool provides a detailed test execution report with logs and screenshots (if configured) after running the tests. You can find the reports in the `target/ExtentReports` folder.

## Contribution

Feel free to fork the repository and submit pull requests. Please make sure to include test coverage for any new features or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.

---

For more information on setting up Selenium, TestNG, and Cucumber, check their official documentation:
- [Selenium WebDriver Documentation](https://www.selenium.dev/documentation/)
- [Cucumber Documentation](https://cucumber.io/docs/)
- [TestNG Documentation](https://testng.org/doc/)