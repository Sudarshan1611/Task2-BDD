Feature: Login Action
  Description: This feature will test a LogIn and LogOut functionality

  Scenario Outline: Login with valid and Invalid Credentials
    Given User is on Amazon Home Page
    When User navigates to Amazon Sign In Page
    Then User enters "<username>" and "<password>"
    And Keeping case as "<Case>"
    Then User clicks on Sign In button
    And Message displayed Login Successfully
    

  Examples:
    | username        | password | Case   |
    | +917498208593  | 7498208593    | Valid  |
    | abc1@gmail.com | dfsd2    | Invalid|
