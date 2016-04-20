$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ClearTripLogin.feature");
formatter.feature({
  "id": "cleartrip-login-functionality",
  "description": "",
  "name": "ClearTrip login functionality",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 1644323000,
  "status": "passed"
});
formatter.scenario({
  "id": "cleartrip-login-functionality;logging-in-with-invalid-credentials-should-show-an-error",
  "description": "",
  "name": "Logging in with invalid credentials should show an error",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I am on cleartrip login page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I enter invalid credentials",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I should see a error message",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "ClearTripLoginSteps.iAmOnCleartripLoginPage()"
});
formatter.result({
  "duration": 2374298000,
  "status": "passed"
});
formatter.match({
  "location": "ClearTripLoginSteps.iEnterInvalidCredentials()"
});
formatter.result({
  "duration": 192459000,
  "status": "passed"
});
formatter.match({
  "location": "ClearTripLoginSteps.iShouldSeeAErrorMessage()"
});
formatter.result({
  "duration": 5329000,
  "status": "passed"
});
formatter.after({
  "duration": 2077032000,
  "status": "passed"
});
});