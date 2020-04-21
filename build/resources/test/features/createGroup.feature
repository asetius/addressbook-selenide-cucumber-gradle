Feature: Create Group

  Scenario: Create group
    Then Input login
    Then Input password
    Then Click "Login" button
    Then Go to group page
    Then Create new group clicking "New group" button
    Then Input group name
    Then Input group header
    Then Input group footer
    Then Submit group creation clicking "Enter information" button
    Then Return to group page
