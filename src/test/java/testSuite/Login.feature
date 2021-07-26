#Author: Suchitra

@login
Feature: Validate login functionality


Scenario: Validate valid login
Given user is on login page
When enter valid email and pwd and click login
Then user should be able to login
