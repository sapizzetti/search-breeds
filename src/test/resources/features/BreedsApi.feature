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

  Scenario: Validate pagination
    Given the Breeds API is available
    When the user requests the endpoint with the limit parameter set to 50
    Then the response must have the next page defined
    And the response should contain exactly 50 breeds
    And the total records should be 98
