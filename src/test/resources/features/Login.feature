@Login
Feature: Login

  @NoLogin @WrongUserName
  Scenario Outline: We will Test Login Scenarios with wrong username formats
    Given User is at Login Page
    When User enters username as "<Username>"
    Then User gets a Validation Message for username

    Examples:
      | Username |
      |a         |
      |a@bcg     |
      |@bc       |
      |ab.com    |

  @NoLogin @NoPassword
  Scenario Outline: We will Test Login Scenarios with blank password
    Given User is at Login Page
    When User enters username as "<Username>"
    And User enters blank password
    Then User gets a Validation Message for password

    Examples:
      |Username          |
      |test@chainsys.com |
      |test@             |

  @NoLogin @WrongCreds
  Scenario Outline: We will Test Login Scenarios with incorrect username and password
    Given User is at Login Page
    When User enters username as "<Username>"
    And User enters password as "<Password>"
    Then User should get a Toast notification

    Examples:
      |Username     |Password
      |test@chainsys.com |psswrd3
      |test10@chainsys.com |psswrd

  @ForgotPassword @ValidEmailAddress
  Scenario Outline: We will Test Validation messages in Forgot Password Screen
    Given User is at Login Page
    When User taps Forgot Password
    And User enters email Address as "<Email>"
    And hits the enter button
    Then User should be getting proper response

    Examples:
      |Email |
      |anirudho@auberginesolutions.com |

  @ForgotPassword @InvalidEmailAddress
  Scenario Outline: We will Test Validation messages in Forgot Password Screen
    Given User is at Login Page
    When User taps Forgot Password
    And User enters email Address as "<Email>"
    And hits the enter button
    Then User should not be getting proper response

    Examples:
      |Email |
      |abc@gmail.com |

 @LoggedIn
  Scenario Outline: We will Test Login Scenarios with correct username and password
    Given User is at Login Page
    When User enters username as "<Username>"
    And User enters password as "<Password>"
    Then User should be redirected to page with title "<Title>"

    Examples:
      |Username     |Password        |Title
      |anirudho@auberginesolutions.com |Gmail@2023    |Title
