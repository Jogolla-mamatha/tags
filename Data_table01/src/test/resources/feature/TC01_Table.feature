Feature: i am automating orange hrm application

Background: common reusable steps 

Given user launch the browser
Then user opens url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then user should enters login credentials

|Admin|admin123|
Then user clicks login button 

Scenario Outline: TC01_Table record - creating job record 
And user clicks admin dashboard
Then click job dropdown and  select Job Titles option then click add button
Then user enters job details 

|JOB6|JOB6 Des|JOB5 Note|
|JOB2|JOB2 Des|JOB2 Note|
|JOB3|JOB3 Des|JOB3 Note|
|JOB4|JOB4 Des|JOB4 Note|

Then  user click save button 
Then logout
Then close browser

