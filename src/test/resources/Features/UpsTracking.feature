Feature: Ups Tracking Feature
  This feature will test UPS tracking functionality

  Background: 
    Given UPS tracking page launched

  @Sprint1 @Tracking
  Scenario: Verify visibility of error message after entry of invalid tracking number
    When Customer input incorrect tracking number "1ZW7F24368619085554230004"
    And Customer clicks on track button
    Then Customer should receive an error message as "The tracking number you entered is not valid. Please review or contact the sender to verify the number."
