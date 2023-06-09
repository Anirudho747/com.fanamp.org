Feature: Event Creation

Scenario: We will save the Event details
 Given  User is at Event List screen
 When User taps on Create Event Button
 And Enters Event Name
 And Enters Nickname
 And Enters Description
 And sets visibility,priority
 And uploads Image
 And sets Event schedule
 And picks Symbol
 And picks Season
 And picks Event Group
 And selects Category
 And taps on Save Button
# Then User gets a confirmatory Toast message
