Feature:	To type a keyword in Google website

Scenario Outline:	Check the typing of keyword
Given navigate to "http://elearningm1.upskills.in/"
When We click on Sign up button page will redirect to registration page
Then enter firstName "<FName>" lastName "<LName>" eMail "<email>" userName "<UName>" Pass "<Pass>" confirmPass "<ConfPass>"
And We click on Register button
Then We validate the "<FName>" and "<LName>"

Then click on img icon in top right corner
Then validate email id"<email>" which is entered.
Then click on Home page tab to return to home page
And click on Compose link to send message to other user.
Then enter Send to email id"<SendTo>" and subject "<Subject>"
And enter Message description.
And Click on send message
Then validate the acknoledgement message displayed.

Examples:
|FName|LName|email|UName|Pass|ConfPass|SendTo|Subject|
|Ashwini|N D|bpl2xnb@ups.com|Ashwini21|Password1|Password1|kaushik@ups.com|testMail|