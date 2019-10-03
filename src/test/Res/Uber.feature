@Uber

Feature: Explain and Show how Uber WebSite
  cululate a price for a ride from point A to
  point B

  Scenario: User will get his ride estimation
    Given User have no result
    When User browse to the Uber ride estimation page
    Then Uber ride estimation  page should display
    Then User enter pick up location as "19 Cornish st ,Staten Island NY "
    And  User enter drop off location as " 220 Riverside blvd , New York NY"
    Then  Uber price estimator table  should display




