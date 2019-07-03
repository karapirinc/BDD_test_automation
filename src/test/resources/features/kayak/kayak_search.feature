@Parallel
Feature: Kayak Flight Search
  Scenario: Search Kayak flights
    Given Open Kayak
    When Kayak Search button clicked
    Then Kayak List results
