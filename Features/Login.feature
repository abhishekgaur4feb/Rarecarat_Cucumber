Feature: RareCarat Login

  Scenario Outline: RareCarat Website Login
    Given Open browser
    When NewUser enters "<uname>" and "<password>"
    Then Message displayed Login Successful

    Examples: 
      | uname                       | password   |
      | abhishekgaur4feb@gmail.com  | Abhi@12345 |
      #| abhishekgaur4feb+@gmail.com | Abhi@12345 |
