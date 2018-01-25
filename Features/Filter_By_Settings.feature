Feature: Filter By Settings

  Scenario Outline: RareCarat Filter By Settings Feature
    Given Open browser for Filter By Settings
    When RareCarat User enters "<Setting_Price_Min>" and "<Setting_Price_Max>" and "<Style>" and "<Metal>"
    Then Message displayed Filter By Setting Successful

    Examples: 
      | Setting_Price_Min | Setting_Price_Max | Style                          | Metal                                                                                                                                                   |
      |               900 |              2000 | Solitaire,SideStone,ThreeStone | fourteen_k_white_gold,eighteen_k_white_gold,fourteen_k_yellow_gold,eighteen_k_yellow_Gold,fourteen_k_rose_gold,eighteen_k_rose_Gold,platinium,palladium |
