#Author: Suchitra 
@Leads
Feature: Create new lead

@Createlead
Scenario: Check the new lead button
Given user is on salesforce dashboard page
When click lead object and click New
Then user is on new lead form page

@Form
Scenario Outline: Fill the new lead form
Given user is on new lead form page
When Fill <Salutation> and <LastName> and <Company>
Then new lead should be created

Examples: 
|Salutation|LastName|Company|
|Mr.|Bilkanti|Magnitia|

@deleteLead
Scenario Outline: To delete a lead
Given user is on lead page
When click on delete in particular<name> page
Then Lead should be deleted
Examples:
|name|
|Bilkanti|

@editForm
Scenario Outline: complete the edit form
Given user is on editpage
When give <Title> and <Email> and <Company> in editpage
Then Lead should Edited
Examples:
	|Title |Email            |Company|
  |sharma|sharma@gmail.com |Mindtree|

@Webtolead
Scenario: Lead is generated from enquiry form
Given user is on respective website enquiry form
When enter the enquiry details
Then user details are updated in salesforce
     