Feature: Search and place order for product
Scenario Outline: Search experience for product search in both home and offer page
Given User is on Greencart landing page
When User searched with shortname <Name> and extracted actual name of product
Then User searched for same shortname <Name> in offers page to check if product exist
Examples:
|Name|
|Tom|
|Strawberry|

Scenario:Test add to cart functionality
Given User is on Greencart landing page
When User searched with shortname Tom and extracted actual name of product
And User increases quantity to 2 and do add to cart
And User procced to checkout
Then Verify product name is same to main page
And  verify if apply and place order buttons are present on page