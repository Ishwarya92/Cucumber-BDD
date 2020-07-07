Feature: Registration
Scenario Outline: User registration scenario

Given user login to the site
Then click on the Skiplogin
Then enter the firstname as "<FirstName>" and lastname as "<LastName>"
Then enter the address as "<Address>" and email as "<Email Address>"
Then enter the phone num as "<Phone>"
Then click on the checkbox "FeMale"
Then select the country dropdown as "India"
Then click on the submit

Examples:
|FirstName|LastName|Address|Email Address|Phone|Country|Password|Confirm Password|
|Ishwarya|C|Vinayagar Nagar|ish987@jio.com|3698521470|India|ish789|ish789|

@scenario1
Scenario Outline: User registration scenario1

Given user login to the site
Then click on the Skiplogin
Then enter the firstname as "<FirstName>" and lastname as "<LastName>"
Then enter the address as "<Address>" and email as "<Email Address>"
Then enter the phone num as "<Phone>"
Then click on the radiobutton as "FeMale"
Then select the country dropdown as "India"
Then click on the submit

Examples:
|FirstName|LastName|Address|Email Address|Phone|Country|Password|Confirm Password|
|Mridvika|V|Vinayagar street|mrid987@jio.com|1478523690|India|alice789|alice789|

@Scenario2
Scenario: Registration form

Given user login to the site
Then click on the Skiplogin
Then enter the firstname as "Monika" and lastname as "Vaishnavi"
Then enter the address as "Pillayar Street" and email as "moni126@gmail.com"
Then enter the phone num as "9863251475"
Then click on the radiobutton as "FeMale"
Then click on the Hobbies as "Cricket"
Then select the language as "English" 
Then select the Skill as "C"
Then select the country dropdown as "India"
Then select the select country by typing "in" and select the select country as "India"
Then select the year as "1992" and month as "May" and date as "9"
Then enter the password1 as "moni768" and password2 as "moni768"
Then click on the submit

