Feature: Book Store Page
Scenario Outline: Search Book in Book Store Page
	Given User go to “book store” page
	When User in “Book Store” page
	And User search book <title>
	Then User see “No rows found”
	
Examples: 
  |title|
  |qa engineer|