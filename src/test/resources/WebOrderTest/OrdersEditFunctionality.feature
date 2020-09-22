
Feature: Testing Edit functionality of orders

  Scenario: Testing order information update functionality
    Given User navigates to WebOrders application and  provides username "Tester" and password "test"
    When User clicks Edit button and update customer Name "Aiza"
    Then Use validates information is updated to "Aiza"

  Scenario: Validate if order is being edited then mandatory fields cannot be empty.
    Given User navigates to WebOrders application and provides username "Tester" and password "test"
    When User click Edit Button and clear Customer name field and update
    Then User is able to view "Field 'Customer name' cannot be empty."
