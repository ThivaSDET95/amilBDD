
@Smoke
Feature: Test login amil freight
@First
Scenario: Amil login with valid and invalid data
Given User is on login page
When user enters below login credentials

|Superuser1A|Admin@12345|
|superuser1B|Admin@123|
|superuse|Admin@12345|
And user clicks sumbit button
Then close broswer

@Second
Scenario Outline: Amil login with examples
Given User is on amil login page
When user enters below login credentials Username "<Username>" Password "<Password>"
And user clicks login button
Then close the broswer
Examples: 
|Username|Password|
|Supeuser1U1|Admin@Admin|
|superuser2U2|Admi12345|
|superuser|Admin@12345|
