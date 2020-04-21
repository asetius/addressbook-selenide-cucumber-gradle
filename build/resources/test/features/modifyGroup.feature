Feature: Modify Group

  Scenario: Modify group
    Then Input login
    Then Input password
    Then Click "Login" button
    Then Go to group page
    Then Select group clicking on checkbox
    Then Modify existing group clicking "Edit group" button
    Then Modify group name
    Then Modify group header
    Then Modify group footer
    Then Update group modification clicking "Update" button
    Then Return to group page