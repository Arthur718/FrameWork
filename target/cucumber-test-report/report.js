$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/arthur/arthur718/src/test/Res/CucomOne");
formatter.feature({
  "line": 3,
  "name": "Spree login functionality",
  "description": "This explain how verious login functionality will work\nOnly valid user should be able to login\n1. Valid user with valid password can login\n2. Invalid user or invalid password can not login",
  "id": "spree-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9884456106,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "1.Valid user with valid password",
  "description": "",
  "id": "spree-login-functionality;1.valid-user-with-valid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Not a validated user",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Spree home page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click login link",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enter user email as \"shiftqa1@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enter password as \"shiftedtech\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Home page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Login success message display",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef1.not_a_validated_user()"
});
formatter.result({
  "duration": 341423441,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.user_browse_to_the_site()"
});
formatter.result({
  "duration": 4611817053,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.spree_home_page_should_display()"
});
formatter.result({
  "duration": 19246437,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.user_click_login_link()"
});
formatter.result({
  "duration": 1438210829,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shiftqa1@gmail.com",
      "offset": 26
    }
  ],
  "location": "StepDef1.userEnterUserEmailAs(String)"
});
formatter.result({
  "duration": 144561890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shiftedtech",
      "offset": 24
    }
  ],
  "location": "StepDef1.userEnterPasswordAs(String)"
});
formatter.result({
  "duration": 97465357,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.user_click_login_button()"
});
formatter.result({
  "duration": 1695241652,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.home_page_should_display()"
});
formatter.result({
  "duration": 26226337,
  "status": "passed"
});
formatter.match({
  "location": "StepDef1.login_success_message_display()"
});
formatter.result({
  "duration": 54164630,
  "status": "passed"
});
formatter.after({
  "duration": 774501620,
  "status": "passed"
});
});