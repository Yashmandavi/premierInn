Feature: As a customer,confirm booking

  @EndToEnd

  Scenario Outline: view the booking section
    Given I am on the Home page
    When I Click on the "Accept cookies"
    And I Click on the "manage booking"
    And I enter reference "<booking>"
    And I enter surname "<surname>"
    And I Click on the "Arrival Date"
    And I Click on the "Next Button"
    And I Click on the "Select Date"
    And I Click on the "Search"
    And I Click on the "Amend Booking"
    And I Click on the "Update Arrival Date"
    And I Click on the "night"



    Examples:
      | booking    | surname |
      | BCVR237241 | Tester  |
      | AUUR261388 | Tester  |
      | AMOR227074 | Tester  |