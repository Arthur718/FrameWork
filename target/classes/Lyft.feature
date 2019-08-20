Feature: Lyft test

Scenario: User will get his ride estimation

      Given  User have no resulet
      When User browse to the Lyft Home page  WebSite
      Then Lyft Home page ride  should display
