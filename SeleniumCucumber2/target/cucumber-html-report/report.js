$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Selenium.feature");
formatter.feature({
  "name": "To type a keyword in Google website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check the typing of keyword",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate to \"http://elearningm1.upskills.in/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "We click on Sign up button page will redirect to registration page",
  "keyword": "When "
});
formatter.step({
  "name": "enter firstName \"\u003cFName\u003e\" lastName \"\u003cLName\u003e\" eMail \"\u003cemail\u003e\" userName \"\u003cUName\u003e\" Pass \"\u003cPass\u003e\" confirmPass \"\u003cConfPass\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "We click on Register button",
  "keyword": "And "
});
formatter.step({
  "name": "We validate the \"\u003cFName\u003e\" and \"\u003cLName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "click on img icon in top right corner",
  "keyword": "Then "
});
formatter.step({
  "name": "validate email id\"\u003cemail\u003e\" which is entered.",
  "keyword": "Then "
});
formatter.step({
  "name": "click on Home page tab to return to home page",
  "keyword": "Then "
});
formatter.step({
  "name": "click on Compose link to send message to other user.",
  "keyword": "And "
});
formatter.step({
  "name": "enter Send to email id\"\u003cSendTo\u003e\" and subject \"\u003cSubject\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "enter Message description.",
  "keyword": "And "
});
formatter.step({
  "name": "Click on send message",
  "keyword": "And "
});
formatter.step({
  "name": "validate the acknoledgement message displayed.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FName",
        "LName",
        "email",
        "UName",
        "Pass",
        "ConfPass",
        "SendTo",
        "Subject"
      ]
    },
    {
      "cells": [
        "Ashwini",
        "N D",
        "bpl2xnb@ups.com",
        "Ashwini20",
        "Password1",
        "Password1",
        "kaushik@ups.com",
        "testMail"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check the typing of keyword",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navigate to \"http://elearningm1.upskills.in/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "seleniumSteps.navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We click on Sign up button page will redirect to registration page",
  "keyword": "When "
});
formatter.match({
  "location": "seleniumSteps.we_click_on_Sign_up_button_page_will_redirect_to_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter firstName \"Ashwini\" lastName \"N D\" eMail \"bpl2xnb@ups.com\" userName \"Ashwini20\" Pass \"Password1\" confirmPass \"Password1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "seleniumSteps.enter_firstName_lastName_eMail_userName_Pass_confirmPass(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We click on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "seleniumSteps.we_click_on_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "We validate the \"Ashwini\" and \"N D\"",
  "keyword": "Then "
});
formatter.match({
  "location": "seleniumSteps.we_validate_the(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on img icon in top right corner",
  "keyword": "Then "
});
formatter.match({
  "location": "seleniumSteps.click_on_img_icon_in_top_right_corner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate email id\"bpl2xnb@ups.com\" which is entered.",
  "keyword": "Then "
});
formatter.match({
  "location": "seleniumSteps.validate_email_id_which_is_entered(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Home page tab to return to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "seleniumSteps.click_on_Home_page_tab_to_return_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Compose link to send message to other user.",
  "keyword": "And "
});
formatter.match({
  "location": "seleniumSteps.click_on_Compose_link_to_send_message_to_other_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Send to email id\"kaushik@ups.com\" and subject \"testMail\"",
  "keyword": "Then "
});
formatter.match({
  "location": "seleniumSteps.enter_Send_to_email_id_and_subject(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Message description.",
  "keyword": "And "
});
formatter.match({
  "location": "seleniumSteps.enter_Message_description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on send message",
  "keyword": "And "
});
formatter.match({
  "location": "seleniumSteps.click_on_send_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the acknoledgement message displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "seleniumSteps.validate_the_acknoledgement_message_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});