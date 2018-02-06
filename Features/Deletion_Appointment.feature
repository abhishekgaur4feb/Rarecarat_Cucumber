Feature: Appointment Deletion

  Scenario Outline: RareCarat Existing Appointment Deletion
    Given Open browser for Appointment Deletion
    When Existing User enters for Appointment Deletion "<uname>" and "<password>" and "<appointment_cancel_number>"
    Then Message displayed Appointment Deleted Successfully
#Sequence should be 2 and than 1
    Examples: 
      | uname                      | password   | appointment_cancel_number |
      | abhishekgaur4feb@gmail.com | Abhi@12345 |                         2 |
      | abhishekgaur4feb@gmail.com | Abhi@12345 |                         1 |
