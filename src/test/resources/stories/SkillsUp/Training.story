Meta:

Narrative:
As a user
I want to go to Lider way training
and see correct price and amount of people in group

Scenario: Checking trainig information
Given the user is on the SkillsUp home page
When the user go to Lider way trainig
Then the user see that amount in group <amount> and price <price>
Examples:
|amount|price|
|12-16 человек|4500 грн|
