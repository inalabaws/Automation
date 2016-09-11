Feature: Login

Scenario Outline: Hello All

Given user navigates to the given page
When he enters his "<username>" and "<password>"
Then he click on submit button and login to application

Examples:

|username | password |
|arjun    | deepu    |
