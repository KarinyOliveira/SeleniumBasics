# Selenium Implicit Wait TestNG Demo

This project demonstrates how to use Selenium Implicit Wait with TestNG for automated testing of a web application. The project is set up using the Page Object Model (POM) pattern and includes parameterized tests using `testng.xml`.

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- Java Development Kit (JDK) 8 or higher
- Chrome Browser
- ChromeDriver

## Project Setup

1. **Clone the Repository**:

   Download the Files from Canvas

2. **Add Selenium, TestNG, and ChromeDriver Dependencies**:

   Add the JAR files needed using the Build Path option

3. **Download ChromeDriver**:

    Download the ChromeDriver executable that matches your Chrome browser version from [here](https://sites.google.com/a/chromium.org/chromedriver/downloads) and place it in a directory on your machine.

4. **Update `testng.xml`**:

    Update the `testng.xml` file with the path to your ChromeDriver executable:

    ```xml
    <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
	<suite name="Selenium Test Suite">
    <test name="Google Search Test">
		<parameter name="driverPath" value="path/to/chromedriver" />
        <parameter name="url" value="https://www.google.com" />
        <parameter name="searchQuery" value="selenium java" />
        <classes>
            <class name="tests.ImplicitWaitGoogleSearchTest" />
        </classes>
     </test>
	</suite>
    ```
    Uncomment the line 33 under ImplicitWaitGoogleSearchTest file
      public void setUp(String driverPath, String url) {
        // Set up ChromeDriver
     >>>>>>>  // System.setProperty("webdriver.chrome.driver", driverPath);
    ```

## Running the Tests

1. **Run the Test Suite**:

    You can run the tests using your IDE.

    **Using IDE**:
    - Right-click on the `testng.xml` file.
    - Select "Run As" > "TestNG Suite".

## Understanding the Code

- **Page Object Model (POM)**: The project uses the POM pattern to separate the test logic from the page-specific code. This is implemented in the `GoogleSearchPage` class.
- **TestNG**: TestNG is used for structuring and running tests. Parameters are passed via the `testng.xml` file.

# Adding New Tests

To add a new test:
1. Create a new class in the `src/tests/` directory.
2. Define your test methods and use the `@Test` annotation.
3. Update the `testng.xml` file to include the new test class.

