Feature: My Stuff

  Scenario Outline: RareCarat Website My Stuff
    Given Open browser for My Stuff
    When Existing User enters for My Stuff "<uname>" and "<password>" and "<price_right>" and "<Carat_left>" and "<Color_right_param>" and  "<Cut_right_param>" and "<Clarity_right_param>"
    Then Message displayed My stuff Successfully tested.

    Examples: 
      | uname                      | password   | price_right | Carat_left | Color_right_param | Cut_right_param | Clarity_right_param |
      | abhishekgaur4feb@gmail.com | Abhi@12345 |       10000 |        1.5 |                80 |             180 |                  84 |
