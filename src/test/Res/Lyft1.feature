
@Lyft
Feature: Lyft test

Scenario: User will get his ride estimation

Given  User have no resulet
When User browse to the Lyft Home page  WebSite
Then Lyft Home page ride  should display
  Then  User click on Rider link button
  And  Lyft Rider page ride  should display
  Then User enter pick up Location as "19 Cornish St , Staten Island NY"
  And User enter drop off Location as "220 Riverside blvd , New York NY"
  And User click on Get Estimate button
  Then Lyft price estimator table  should display

