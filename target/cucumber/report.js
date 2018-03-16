$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: amolabhi@gmail.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login feature",
  "description": "I want to use this template for my feature file",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@SmokeTest"
    }
  ]
});
formatter.background({
  "line": 23,
  "name": "User is succcessfully access the URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 24,
  "name": "user opens Chrome browser",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user enters the URL \"http://192.168.0.222:90/finsys\"",
  "keyword": "And "
});
formatter.match({
  "location": "AppLaunch.OpenBrowser()"
});
formatter.result({
  "duration": 4286914215,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://192.168.0.222:90/finsys",
      "offset": 21
    }
  ],
  "location": "AppLaunch.EnterURL(String)"
});
formatter.result({
  "duration": 4196117210,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Login Functionality for invalid username and invalid password",
  "description": "",
  "id": "login-feature;login-functionality-for-invalid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@LoginWithInvalidCredentials"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User is on the application login page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user enters \"dummyfm%$#\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user enters \"Password@#!\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "error message \"Please Enter Valid Username or Password!!!\" displayes at the bottom",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.apploginpage()"
});
formatter.result({
  "duration": 5106528167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummyfm%$#",
      "offset": 13
    }
  ],
  "location": "Login.enterusername(String)"
});
formatter.result({
  "duration": 2539851564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password@#!",
      "offset": 13
    }
  ],
  "location": "Login.enterpassword(String)"
});
formatter.result({
  "duration": 2230644285,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickloginbutton()"
});
formatter.result({
  "duration": 5183787705,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});