@Parallel
Feature: SkyScanner Flight Search
  Scenario: Search SkyScanner flights
    Given SkyScanner Default inputs
    When SkyScanner Search button clicked
    Then SkyScanner List results
