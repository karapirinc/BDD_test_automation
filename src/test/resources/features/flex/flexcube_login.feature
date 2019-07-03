@Parallel @Google
Feature: Google Flights Search
  Scenario: Search Google flights
    Given Open Google Flight
    When Search Google Flights
    Then List Google Flight results


#  Scenario: Search Google flights2
#    Given Google Flight Default inputs2
#      | firstName   | lastName | birthDate  |
#      | Annie M. G. | Schmidt  | 1911-03-20 |
#      | Roald       | Dahl     | 1916-09-13 |
#      | Astrid      | Lindgren | 1907-11-14 |
#    When Google Flight Search button clicked2
#    Then Google Flight List results2

