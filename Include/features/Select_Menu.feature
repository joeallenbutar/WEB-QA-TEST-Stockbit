Feature: Select Menu Page
Scenario: Fill field in Select Menu Page
  Given User go to “select menu” page
  When User in “select menu” page
  And User choose select value “Another root option”
  And User choose select one “Other”
  And User choose old style select menu “Aqua”
  And User choose multi select drop down “all color”
  Then User success input all select menu