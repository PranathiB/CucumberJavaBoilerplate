$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ClearTripLogin.feature");
formatter.feature({
  "line": 1,
  "name": "ClearTrip login functionality",
  "description": "",
  "id": "cleartrip-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1514001642,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Logging in with invalid credentials should show an error",
  "description": "",
  "id": "cleartrip-login-functionality;logging-in-with-invalid-credentials-should-show-an-error",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on cleartrip login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see a error message",
  "keyword": "Then "
});
formatter.match({
  "location": "ClearTripLoginSteps.iAmOnCleartripLoginPage()"
});
formatter.result({
  "duration": 1194809647,
  "status": "passed"
});
formatter.match({
  "location": "ClearTripLoginSteps.iEnterInvalidCredentials()"
});
formatter.result({
  "duration": 281800497,
  "status": "passed"
});
formatter.match({
  "location": "ClearTripLoginSteps.iShouldSeeAErrorMessage()"
});
formatter.result({
  "duration": 3629705,
  "status": "passed"
});
formatter.after({
  "duration": 2079428222,
  "status": "passed"
});
});