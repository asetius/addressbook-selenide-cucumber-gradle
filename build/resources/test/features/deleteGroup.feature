Feature: Delete Group

  Scenario: Delete group
    Then Input login
    Then Input password
    Then Click "Login" button
    Then Go to group page
    Then Select group clicking on checkbox
    Then Delete existing group clicking "Delete group(s)" button
    Then Return to group page