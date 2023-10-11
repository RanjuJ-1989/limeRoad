@SmokeTest
Feature: Lime-Road order

Background: To search the Product for Men
When User Clicks url "https://www.limeroad.com/"
And User click login
And User enter MobileNumber "7010019049"
Then User click next
And User Mouseover on Men
And User picks Suit Blazer
And User selects wished item 


@TC001
Scenario: Shop the Product and Add to Cart 
And User select Large size of the Suit Blazer
And User click on Add to cart 

