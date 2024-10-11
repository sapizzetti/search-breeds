Feature: Test Breeds API

  Scenario: Search Breeds
    Given the Breeds API is available
    When the user request the list of breeds
    Then the response should have status 200
    And the breeds data should not be null

  Scenario: Invalid Endpoint
    Given the Breeds API is available
    When the user request an invalid endpoint
    Then the response should have status 404

  Scenario: Search a specific breed by name
    Given the breed name is "Siamese"
    When the user makes a request to get the breed information
    Then the response should have status 200
    And the response should contain the breed name "Siamese"

