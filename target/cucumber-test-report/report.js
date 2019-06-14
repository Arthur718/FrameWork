$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/arthur/arthur718/src/test/Res/Uber");
formatter.feature({
  "line": 1,
  "name": "Explain and Show how Uber WebSite",
  "description": "cululate a price for a ride from point A to\npoint B",
  "id": "explain-and-show-how-uber-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5608005793,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "User will get his ride estimation",
  "id": "explain-and-show-how-uber-website;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User have no result",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User browse to the Uber ride estimation page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Uber ride estimation  page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User enter pick up location as \"19 Cornish st ,Staten Island NY \"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User enter drop off location as \" 220 Riverside blvd , New York NY\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Uber price estimator table  should display",
  "keyword": "Then "
});
formatter.match({
  "location": "UberSteps.userHaveNoResult()"
});
formatter.result({
  "duration": 252781502,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.userBrowseToTheUberRideEstimationPage()"
});
formatter.result({
  "duration": 4696661311,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.uberRideEstimationPageShouldDisplay()"
});
formatter.result({
  "duration": 15410080,
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
  "duration": 2716227156,
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
  "duration": 10932685048,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.uberPriceEstimatorTableShouldDisplay()"
});
formatter.result({
  "duration": 83020105,
  "status": "passed"
});
formatter.after({
  "duration": 168906548,
  "status": "passed"
});
});