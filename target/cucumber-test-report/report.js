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
  "duration": 7249440947,
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
  "duration": 531220756,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.user_browse_to_the_Lyft_Home_page_WebSite()"
});
formatter.result({
  "duration": 3082517222,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.lyft_Home_page_ride_should_display()"
});
formatter.result({
  "duration": 40038083,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.user_click_on_Rider_link_button()"
});
formatter.result({
  "duration": 2790698597,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.lyft_Rider_page_ride_should_display()"
});
formatter.result({
  "duration": 76901461,
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
  "duration": 2559748106,
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
  "duration": 3045742772,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.user_click_on_Get_Estimate_button()"
});
formatter.result({
  "duration": 2224512061,
  "status": "passed"
});
formatter.match({
  "location": "LyftStepS.lyft_price_estimator_table_should_display()"
});
formatter.result({
  "duration": 6841509529,
  "status": "passed"
});
formatter.after({
  "duration": 333800958,
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
  "duration": 2403401585,
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
  "duration": 12603996,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.userBrowseToTheUberRideEstimationPage()"
});
formatter.result({
  "duration": 5072808243,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.uberRideEstimationPageShouldDisplay()"
});
formatter.result({
  "duration": 157445115,
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
  "duration": 5140896971,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027arthurs-air.lan\u0027, ip: \u0027fe80:0:0:0:1c93:5b29:9cec:1647%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: /var/folders/82/5dp6rk595zx...}, goog:chromeOptions: {debuggerAddress: localhost:56965}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d946fac39dd6ae0568ff4efe4bd35ea7\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\n\tat StepDef.UberSteps.userEnterPickUpLocationAs(UberSteps.java:51)\n\tat ✽.Then User enter pick up location as \"19 Cornish st ,Staten Island NY \"(Uber.feature:12)\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "UberSteps.uberPriceEstimatorTableShouldDisplay()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 228662304,
  "status": "passed"
});
});