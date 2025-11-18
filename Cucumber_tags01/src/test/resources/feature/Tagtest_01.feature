Feature: i am automating orange hrm application

Background: common reusable steps 

Given user launch the browser
Then user opens url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then user enters username as "Admin" and password as "admin123" and click loginbtn

@mamatha
Scenario: TC01_AddSkills record - creating skills record 
And user clicks admin dashboard
Then click qualification dropdown and click skills option then click add btn 
And user enters skillname as "automation" and skill description as "automation testingg  " and click save btn
Then logout
Then close browser


@sanity
Scenario: TC01_Addjob record - creating job record 
And user clicks admin dashboard
Then click job dropdown and Job Titles option and then  click add btn 
Then  user enters jobname as "xyba" and enter job description as " abcba" and enter note as "AbXba" and click save btn
Then logout
Then close browser

@smoke @mamatha 
Scenario: TC03_AddNationalities record creating nationalities record  
And  user clicks  admin dashboard1
Then click Nationalities option and then click add button
Then user enters the name as  "china" and click save button 
Then logout
Then  close chrome   