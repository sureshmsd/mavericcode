$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "Verify if user is able to Login",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify if user is able to Login",
  "description": "",
  "id": "login-feature;verify-if-user-is-able-to-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Scb"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user enter the given url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigates to login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user navigates to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefnition_SCB.user_enter_the_given_url()"
});
formatter.result({
  "duration": 13202631619,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d78.0.3904.108)\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027W2012R2-BENCH06\u0027, ip: \u0027192.168.25.73\u0027, os.name: \u0027Windows Server 2012 R2\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_162\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d78.0.3904.11 (eaaae9de6b8999773fa33f92ce1e1bbe294437cf-refs/branch-heads/3904@{#86}), userDataDir\u003dC:\\Users\\muralim\\AppData\\Local\\Temp\\10\\scoped_dir27780_994698172}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dWIN8_1, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:51286}, acceptInsecureCerts\u003dfalse, browserVersion\u003d78.0.3904.108, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dWIN8_1, setWindowRect\u003dtrue}]\nSession ID: 8ea7d0fc9a65f07dea30a45bca261321\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:703)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:934)\r\n\tat Pages.login.Home(login.java:25)\r\n\tat Stepdefinition.Stepdefnition_SCB.user_enter_the_given_url(Stepdefnition_SCB.java:25)\r\n\tat ✽.Given user enter the given url(Login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefnition_SCB.user_navigates_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefnition_SCB.user_navigates_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
});