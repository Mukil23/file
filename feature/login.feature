Feature: Login page verification

Scenario Outline: to check login in store
Given enter the browser and page
When user enter the "<username>" and "<pass>"
Then user click login button
Then user verify the login 
Examples:
  |username              |pass        |
  |zzzmukila@gmail.com   |mukil123    |
  |mukil@gmail.com       |lavan123    |