Feature: RareCarat Signup

  Scenario Outline: RareCarat Website Signup
    Given Open browser for Signup
    When NewRarecaratUser enters "<fname>" and "<lname>" and "<email_signup>" and "<signup_password>"
    Then Message displayed Signup Successful

    Examples: 
      | fname    | lname | email_signup                    | signup_password |
      | Abhishek | Gaur  | abhishekgaur4feb+1992@gmail.com | Abc@12345       |
