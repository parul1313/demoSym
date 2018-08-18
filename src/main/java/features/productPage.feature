Feature: Sywm

Scenario: Demo Swym Products page

Given user is already on products page
When product page is displayed
Then verify size option is clickable
Then verify color dropdown is clickable
Then verify add to wishlist button is enabled and add the product to the wishlist
Then user should be navigated to the wishlist page
Then user should be able to see the product in the wishlist
Then click on the email button
Then click on connect button and enter email address
Then user should be see email sent response message

