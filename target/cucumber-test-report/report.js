$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/arthur/arthur718/src/test/Res/Uber");
formatter.feature({
  "line": 1,
  "name": "Explain and Show how Uber WebSite",
  "description": "cululate a price for a ride from point A to\npoint B",
  "id": "explain-and-show-how-uber-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6480771042,
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
  "duration": 310341723,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.userBrowseToTheUberRideEstimationPage()"
});
formatter.result({
  "duration": 5082285031,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.uberRideEstimationPageShouldDisplay()"
});
formatter.result({
  "duration": 20048536,
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
  "duration": 3931155100,
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
  "duration": 10958764253,
  "status": "passed"
});
formatter.match({
  "location": "UberSteps.uberPriceEstimatorTableShouldDisplay()"
});
formatter.result({
  "duration": 80560125,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"div.ae.af div.dotcom-price-estimator.ba.bb.bc.bd.be.bf.bg.bh.bi.ae.rd.bl.re.bn.bo.bp.bq.rf.bs.rg.bu.rh.bw.lu.by:nth-child(2) div.bq.bz.c0 div.sd.ec.cs.fz.g0.vd.fa.ej.g2.da.ve.g4.fv.g6.g7.vf div.c3.fi.vg div.vh.vi.c3.c4.ok.vj.vk.vl div.be \u003e h3.wk.zl.zm.zn.gu.bf.u8.u6.lh.li.hl.ff.gw.gv.l1.ke.te\"}\n  (Session info: chrome\u003d75.0.3770.100)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Arthurs-Air\u0027, ip: \u00272604:2000:1601:8624:0:0:0:f97%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.5\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 75.0.3770.100, chrome: {chromedriverVersion: 75.0.3770.8 (681f24ea911fe7..., userDataDir: /var/folders/82/5dp6rk595zx...}, goog:chromeOptions: {debuggerAddress: localhost:59185}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 182e388396a79faa638837a9ddc1e406\n*** Element info: {Using\u003dcss selector, value\u003ddiv.ae.af div.dotcom-price-estimator.ba.bb.bc.bd.be.bf.bg.bh.bi.ae.rd.bl.re.bn.bo.bp.bq.rf.bs.rg.bu.rh.bw.lu.by:nth-child(2) div.bq.bz.c0 div.sd.ec.cs.fz.g0.vd.fa.ej.g2.da.ve.g4.fv.g6.g7.vf div.c3.fi.vg div.vh.vi.c3.c4.ok.vj.vk.vl div.be \u003e h3.wk.zl.zm.zn.gu.bf.u8.u6.lh.li.hl.ff.gw.gv.l1.ke.te}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat StepDef.UberSteps.uberPriceEstimatorTableShouldDisplay(UberSteps.java:94)\n\tat ✽.Then Uber price estimator table  should display(/Users/arthur/arthur718/src/test/Res/Uber:11)\n",
  "status": "failed"
});
formatter.after({
  "duration": 226592455,
  "status": "passed"
});
});