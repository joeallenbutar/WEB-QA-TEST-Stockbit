Feature: Book Store Page
Scenario Outline: Search Book in Book Store Page
	Given User go to “book store” page
	When User in “Book Store” page
	And User search book <title>
	And User click book “Git Pocket Guide”
	Then User see “Git Pocket Guide”
	
Examples: 
  |title|
  |Git Pocket Guide|