$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 34,
  "name": "Registration form",
  "description": "",
  "id": "registration;registration-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user login to the site",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "click on the Skiplogin",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "enter the firstname as \"Monika\" and lastname as \"Vaishnavi\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "enter the address as \"Pillayar Street\" and email as \"moni126@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "enter the phone num as \"9863251475\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "click on the radiobutton as \"FeMale\"",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "click on the Hobbies as \"Cricket\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "select the language as \"English\"",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "select the Skill as \"C\"",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "select the country dropdown as \"India\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "select the select country by typing \"in\" and select the select country as \"India\"",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "select the year as \"1992\" and month as \"May\" and date as \"9\"",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "enter the password1 as \"moni768\" and password2 as \"moni768\"",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "click on the submit",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinitions.login()"
});
formatter.result({
  "duration": 18809552800,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinitions.SkipLogin()"
});
formatter.result({
  "duration": 6058767900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Monika",
      "offset": 24
    },
    {
      "val": "Vaishnavi",
      "offset": 49
    }
  ],
  "location": "loginStepDefinitions.user_enters_firstname_lastname(String,String)"
});
formatter.result({
  "duration": 412273100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pillayar Street",
      "offset": 22
    },
    {
      "val": "moni126@gmail.com",
      "offset": 53
    }
  ],
  "location": "loginStepDefinitions.user_enter_address(String,String)"
});
formatter.result({
  "duration": 673563900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9863251475",
      "offset": 24
    }
  ],
  "location": "loginStepDefinitions.user_enter_phone(String)"
});
formatter.result({
  "duration": 209049000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FeMale",
      "offset": 29
    }
  ],
  "location": "loginStepDefinitions.click_Gender(String)"
});
formatter.result({
  "duration": 2410073200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cricket",
      "offset": 25
    }
  ],
  "location": "loginStepDefinitions.click_hobbies(String)"
});
formatter.result({
  "duration": 142102600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 24
    }
  ],
  "location": "loginStepDefinitions.select_language(String)"
});
formatter.result({
  "duration": 357325300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C",
      "offset": 21
    }
  ],
  "location": "loginStepDefinitions.select_skill(String)"
});
formatter.result({
  "duration": 363999300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 32
    }
  ],
  "location": "loginStepDefinitions.select_country(String)"
});
formatter.result({
  "duration": 196514900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "in",
      "offset": 37
    },
    {
      "val": "India",
      "offset": 75
    }
  ],
  "location": "loginStepDefinitions.select_selectcountry(String,String)"
});
formatter.result({
  "duration": 547045500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1992",
      "offset": 20
    },
    {
      "val": "May",
      "offset": 40
    },
    {
      "val": "9",
      "offset": 58
    }
  ],
  "location": "loginStepDefinitions.select_DOB(String,String,String)"
});
formatter.result({
  "duration": 795402800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "moni768",
      "offset": 24
    },
    {
      "val": "moni768",
      "offset": 51
    }
  ],
  "location": "loginStepDefinitions.enter_password_confirm_password(String,String)"
});
formatter.result({
  "duration": 352181900,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefinitions.Submit()"
});
formatter.result({
  "duration": 424219700,
  "status": "passed"
});
});