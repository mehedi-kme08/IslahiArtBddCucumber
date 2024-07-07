Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page "https://islahiart.com/my-account/"
    When the user clicks the login tab
    And the user enters a valid username "mehedi.me91@gmail.com"
    And the user enters a valid password "Auto12345$"
    And the user clicks the login button
    Then the user will land on the home page "https:/"