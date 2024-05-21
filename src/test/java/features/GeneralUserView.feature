Feature: General view

  Scenario: validate general user is able view products without logging in
    Given User navigates to the online products page
    When User clicks on formal shoes drop down
    Then User should be able to view the products