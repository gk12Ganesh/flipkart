

Feature: Tv purchase
 
  Scenario: user purachsing tv
    Given user launching URL
    And   user login flipkart
    When  user search the tv
    And   user select the tv
    And   user add to cart the tv
    Then  user place order
    
 Scenario: user purachsing tv
    Given user launching URL
    And   user login flipkart
    When  user search the tv using oneD list
    |sony TV|samsung TV|LG TV|
    And   user select the tv
    And   user add to cart the tv
    Then  user place order
    
  Scenario: user purachsing tv
    Given user launching URL
    And   user login flipkart
    When  user search the tv using oneD map
    |TV1|redmi TV|
    |TV2|realmi TV|
    And   user select the tv
    And   user add to cart the tv
    Then  user place order
    
  Scenario Outline: user purachsing tv
    Given user launching URL
    And   user login flipkart
    When  user search the tv "<TV>"
    And   user select the tv
    And   user add to cart the tv
    Then  user place order
  
  Examples:
 |TV|
 |sony TV|
 |redmi TV|
 |realme TV|
 
 
 
 
 
 
 
   
