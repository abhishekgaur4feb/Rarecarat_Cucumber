Feature: Appointment Booking

  Scenario Outline: RareCarat Website Appointment Booking
    Given Open browser for Appointment Booking
    When Existing User enters "<uname>" and "<password>" and "<zipcode>" and "<location>" and "<date_available>" and "<time_available>" and "<appointment_time>"
    Then Message displayed Login Successful for Appointment Booking

    Examples: 
      | uname                      | password   | zipcode | location          | date_available | time_available | appointment_time |
      | abhishekgaur4feb@gmail.com | Abhi@12345 |   74999 | EasternTimeDallas | NOW+3          | 4:30           |                1 |
    	| abhishekgaur4feb@gmail.com | Abhi@12345 |   74999 | EasternTimeDallas | NOW+2          | 12:30          |                2 |
     # | abhishekgaur4feb@gmail.com | Abhi@12345 |   74999 | EasternTimeDallas | NOW+2          | 1:00           |                2 |
