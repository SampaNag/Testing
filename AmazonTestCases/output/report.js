$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Checking Sign in functionality working as a user",
  "description": "",
  "id": "checking-sign-in-functionality-working-as-a-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "verify user can login successfully",
  "description": "",
  "id": "checking-sign-in-functionality-working-as-a-user;verify-user-can-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user clicks \"Sign in\" link",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user types valid email \"mayanag2017@gmail.com\"  and password \"Animation@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on \"Sign in\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should landed on the page with text \"Hello, Maya\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_MyStepdefs.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 1824538073,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 13
    }
  ],
  "location": "Login_MyStepdefs.userClicksLink(String)"
});
formatter.result({
  "duration": 660201087,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mayanag2017@gmail.com",
      "offset": 24
    },
    {
      "val": "Animation@123",
      "offset": 62
    }
  ],
  "location": "Login_MyStepdefs.userTypesValidEmailAndPassword(String,String)"
});
formatter.result({
  "duration": 26311506,
  "error_message": "java.lang.NullPointerException\r\n\tat PageObject.LoginPage.entertheemail(LoginPage.java:18)\r\n\tat PageObjects.Login_MyStepdefs.userTypesValidEmailAndPassword(Login_MyStepdefs.java:25)\r\n\tat ✽.And user types valid email \"mayanag2017@gmail.com\"  and password \"Animation@123\"(src/test/resources/Login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 16
    }
  ],
  "location": "Login_MyStepdefs.userClicksOn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello, Maya",
      "offset": 42
    }
  ],
  "location": "Login_MyStepdefs.userShouldLandedOnThePageWithText(String)"
});
formatter.result({
  "status": "skipped"
});
});