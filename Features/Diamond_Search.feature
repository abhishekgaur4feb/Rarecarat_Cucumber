Feature: Diamond Search

  Scenario Outline: Diamond Search with Filters
    Given Open firefox and start application
    When User enters "<price_right>" and "<Carat_left>" and "<Color_right_param>" and  "<Cut_right_param>" and "<Clarity_right_param>"
    Then Message displayed Search Successful
    Then Application should be closed

    Examples: 
      | price_right | Carat_left | Color_right_param  | Cut_right_param |  Clarity_right_param |
      |       10000 |        1.5 |             80     |           180   |                84    |

      
