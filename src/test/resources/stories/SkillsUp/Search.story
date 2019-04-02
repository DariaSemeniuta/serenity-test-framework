Meta:

Narrative:
As a user
I want to perform search
So that I can serch team members and certificates

Scenario: Cheking search functionality
Given the user is on the SkillsUp home page
When the user type Alexander
Then the user see next <result> with <description>
Examples:
|result|description|
|Alexander Galkovskiy|читает курсы «Diving into Java»|
|06109150|Alexander Tsariov|

Scenario: Checking search with kirilica (negative case)
Given the user is on the SkillsUp home page
When the user type Галковский
Then the user doesn't see any results for Галковский