# Selenium Basics

This repository contains various Selenium testing examples implemented in Java. The tests are designed to showcase fundamental Selenium concepts such as interacting with web elements, using waits, handling alerts, and working with Page Objects. These tests are built using **TestNG** as the testing framework and **Maven** as the build tool.

## Table of Contents

- [Overview](#overview)
- [Technologies](#technologies)
- [Project Setup](#project-setup)
- [How to Run the Tests](#how-to-run-the-tests)
- [Additional Resources](#additional-resources)

## Overview

This project demonstrates Selenium automation tests for different demo websites and functionalities. Each test is designed to introduce key Selenium concepts and best practices. Below are the websites and functionalities covered:

1. **Advantage Demo Site** - Tests for login, product selection, and cart.
2. **Demo Blaze** - Testing basic e-commerce site features like product browsing and purchase.
3. **Yellow World** - Interactions with dynamic elements on a demo website.
4. **Implicit Wait** - Usage of implicit waits for elements.
5. **Open Cart** - E-commerce site tests for adding products to the cart, checkout flow, and user authentication.
6. **Page Objects** - Implementing Page Object Model (POM) for reusable components.
7. **Selenium Alerts** - Handling browser alerts using Selenium.
8. **Target** - Tests for various element interactions on Target's website.
9. **Testing Basics** - Basic Selenium testing concepts (e.g., locating elements, clicking, sending text).
10. **Wikipedia** - Search functionality tests on Wikipedia.

## Technologies

- **Java**: Programming language used for writing test scripts.
- **Selenium WebDriver**: Browser automation tool.
- **TestNG**: Testing framework used for running tests and organizing test cases.
- **Maven**: Build automation tool for managing dependencies and running tests.
- **WebDriver Manager**: For managing browser drivers automatically.

## Project Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/KarinyOliveira/SeleniumBasics.git
    cd SeleniumBasics
    ```

2. **Install dependencies**:
    Ensure that you have Maven installed on your machine, and run the following command to install the required dependencies:
    ```bash
    mvn clean install
    ```

3. **Configure WebDriver**:
   The project uses **WebDriverManager** for automatic driver management, so no manual setup is required. 

4. **Test Configuration**:
   Test configurations such as browser type, base URLs, and timeouts can be modified in the `testng.xml` or properties files.


```

### Key Classes

- **AdvantageDemoTest.java**: Tests user login, adding products to cart, and checking out.
- **DemoBlazeTest.java**: Tests for product navigation and purchase.
- **YellowWorldTest.java**: Tests for interacting with dynamic elements on the page.
- **ImplicitWaitTest.java**: Demonstrates the usage of implicit waits for element interactions.
- **OpenCartTest.java**: Tests for adding and removing items from the cart in an e-commerce app.
- **PageObjectTest.java**: Demonstrates the Page Object Model for reusable page elements.
- **SeleniumAlertTest.java**: Tests for handling browser alerts like confirmations and popups.
- **TargetTest.java**: General site interactions like search and adding items to a cart.
- **TestingBasicsTest.java**: Covers basic operations like clicking, sending text, and retrieving information.
- **WikipediaTest.java**: Tests for search functionality and page validation.

## How to Run the Tests

1. **Run using Maven**:
    Use the following command to run all the tests:
    ```bash
    mvn test
    ```

2. **Run a specific test**:
    To run a specific test, modify the `testng.xml` or use Maven to specify the test class:
    ```bash
    mvn -Dtest=AdvantageDemoTest test
    ```

3. **Run using TestNG**:
    You can also run the tests directly using the TestNG plugin in your IDE (e.g., IntelliJ or Eclipse).

## Additional Resources

- [Selenium Documentation](https://www.selenium.dev/documentation/)
- [TestNG Documentation](https://testng.org/doc/)
- [Maven Documentation](https://maven.apache.org/)