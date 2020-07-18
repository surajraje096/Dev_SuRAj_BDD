Feature: Login Application


Scenario: user into home pagez
Given user into lounch chrome browser
Then verify current url
Then verify home page title
Then verify home page logo
Then how many product present in home page
Then verify product link on home page
Then verify  sign in button
Then verify login button

Scenario: user on signUp page
Given verify use in registration page
Then fill User Details the form 
Then fill Shipping Address the form 
Then fill Billing Address the form 
Then user clik on sumbit button
Then user successfully submit registration page


Scenario: user on sign page
Given user click on login button
Then verify user in login page
Then user type userid andan password
Then user click on submit button
Then user verify Welcome profile page
