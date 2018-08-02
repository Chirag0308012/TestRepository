Feature: Login Functionality of MyBank
 
  Scenario: Login Logout functionaltiy verification
    Given I am on Login page
    Given entering valid  <username> and invalid <password> 
      | username    | password   |
      | RyallM2908  | Password11 | 
      | PinnerC2504 | Password2  | 
    
    When I click login button
    Then Login should not be successful
    
    