$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Lyft1.feature");
formatter.feature({
  "line": 3,
  "name": "Lyft test",
  "description": "",
  "id": "lyft-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Lyft"
    }
  ]
});
formatter.before({
  "duration": 5214559007,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User will get his ride estimation",
  "description": "",
  "id": "lyft-test;user-will-get-his-ride-estimation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User have no resulet",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User browse to the Lyft Home page  WebSite",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Lyft Home page ride  should display",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on Rider link button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Lyft Rider page ride  should display",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter pick up Location as \"19 Cornish St , Staten Island NY\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter drop off Location as \"220 Riverside blvd , New York NY\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on Get Estimate button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Lyft price estimator table  should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LyftStepS.user_have_no_resulet()"
});
formatter.result({
  "duration": 719906607,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.user_browse_to_the_Lyft_Home_page_WebSite()"
});
formatter.result({
  "duration": 2767312445,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.lyft_Home_page_ride_should_display()"
});
formatter.result({
  "duration": 420555007,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.user_click_on_Rider_link_button()"
});
formatter.result({
  "duration": 2026237434,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.lyft_Rider_page_ride_should_display()"
});
formatter.result({
  "duration": 57275071,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "19 Cornish St , Staten Island NY",
      "offset": 32
    }
  ],
  "location": "LyftStepS.user_enter_pick_up_Location_as(String)"
});
formatter.result({
  "duration": 1357925702,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "220 Riverside blvd , New York NY",
      "offset": 33
    }
  ],
  "location": "LyftStepS.user_enter_drop_off_Location_as(String)"
});
formatter.result({
  "duration": 2806636070,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.user_click_on_Get_Estimate_button()"
});
formatter.result({
  "duration": 2151332469,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.lyft_price_estimator_table_should_display()"
});
formatter.result({
  "duration": 6769369487,
  "status": "passed"
});
formatter.after({
  "duration": 239997992,
  "status": "passed"
});
formatter.uri("Uber.feature");
formatter.feature({
  "line": 3,
  "name": "Explain and Show how Uber WebSite",
  "description": "cululate a price for a ride from point A to\npoint B",
  "id": "explain-and-show-how-uber-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Uber"
    }
  ]
});
formatter.before({
  "duration": 1779395847,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "User will get his ride estimation",
  "id": "explain-and-show-how-uber-website;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User have no result",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User browse to the Uber ride estimation page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Uber ride estimation  page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enter pick up location as \"19 Cornish st ,Staten Island NY \"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter drop off location as \" 220 Riverside blvd , New York NY\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Uber price estimator table  should display",
  "keyword": "Then "
});
formatter.match({
  "location": "UberSteps.userHaveNoResult()"
});
formatter.result({
  "duration": 12597339,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.userBrowseToTheUberRideEstimationPage()"
});
formatter.result({
  "duration": 4900366711,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.uberRideEstimationPageShouldDisplay()"
});
formatter.result({
  "duration": 26499522,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "19 Cornish st ,Staten Island NY ",
      "offset": 32
    }
  ],
  "location": "UberSteps.userEnterPickUpLocationAs(String)"
});
formatter.result({
  "duration": 15903259226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " 220 Riverside blvd , New York NY",
      "offset": 33
    }
  ],
  "location": "UberSteps.userEnterDropOffLocationAs(String)"
});
formatter.result({
  "duration": 13738182047,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.uberPriceEstimatorTableShouldDisplay()"
});
formatter.result({
  "duration": 6838052235,
  "status": "passed"
});
formatter.after({
  "duration": 199044593,
  "status": "passed"
});
});