#Author: Suchitra
@Lead_ops
Feature: To ckeck the operations of lead 
@convert
Scenario: convert lead to contact
Given user is on Leadpage
When click on next stages
Then Lead is converted into contacts

@import
Scenario: import the lead file
Given user is on home page
When click on import and add csv file
Then csv file should be imported

@validate
Scenario: to compare the values in object Manager and drop down values are same
Given check the values in object Manager and dropdown
When compare both the values
Then the values should be same