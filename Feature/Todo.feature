Feature: Create a Todo
 
Scenario: Creating a new Todo
	Given User is on Home Page
	When User Navigate to create Todo
	And User enters sample text
	Then User press enter in keyboard to save
  
	Then User selects the first todo item to make it complete
	
	And User enters sample text

	Then User selects the first todo item to delete it

	Then User selects the Active tab to see the active todos
 
	Then User selects the Completed tab to see the Completed todos	
 