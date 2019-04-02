Story: Find teachers in  SkillsUp school
Narrative:
In order to find teacher and find out which cource he teaches
As an SkillsUp student
I want to look up teachers in SkillsUp school

Scenario: Find teachers
Given the user is on the SkillsUp home page
When the user go to Team Page
Then the user can see next coache <name> with position <position>
Examples:
|name|position|
|Александр Галковский|тренер|
|Артем Карпов|тренер|
|Михаил Чокан|руководитель учебного центра|
|Ева Корнеплянская|контент-менеджер, тестировщик|
|Илья|координатор учебного центра|
Scenario: Cheking courses
Given the user go to Team Page
When the user can go to personal card of coach <name>
Then the user see next course <course>
Examples:
|name|course|
|Александр Галковский|Погружение в Java|
|Артем Карпов|Автоматизация тестирования ПО|



