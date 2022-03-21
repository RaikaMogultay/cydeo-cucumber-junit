Feature: User verifies John Wick is in the list
  Agile story: As a user, I should see John Wick is in the list

  Scenario: User verifies John Wick is in the list
    Given User is on the SmartBear Login Page
    When User is logged into SmartBear Tester account and on Order page
    And  User selects FamilyAlbum from product dropdown
    And User enters "4" to quantity
    And User enters "John Wick" to costumer name
    And User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    And User enters "IL" to state
    And  User enters "60056"
    And User selects Visa as card type
    And User enters "1111222233334444" to card number
    And  User enters "12/22" to expiration date
    And  User clicks process button
    Then User verifies "John Wick" is in the list

  Scenario Outline: Smart Bear Process
    Given User is on the SmartBear Login Page
    When User is logged into SmartBear Tester account and on Order page
    Given User selects "<TYPE>" from product dropdown
    And User enters "<Quantity>" to quantity
    And User enters "<Name>" to costumer name
    And User enters "<Street>" to street
    And User enters "<City>" to city
    And User enters "<State>" to state
    And User enters "<Zip>" to zip
    And User selects  "<CrType>" as a credit type
    And User enters "<CreditCardNum>" to card number
    And User enters "<Date>" to expiration date
    And User clicks process button
    And User enters "<Names>" to costumer name

    Examples:
      | TYPE        | Quantity | Name             | Street        | City     | State | Zip   | CrType | CreditCardNum    | Date  | Names            |
      | MyMoney     | 4        | Ken Adams        | Kenzie st     | New York | NY    | 34244 | Visa   | 3528122112211431 | 11/22 | Ken Adams        |
      | FamilyAlbum | 7        | Joey Tribiani    | River st      | New York | NY    | 43439 | Visa   | 5428122112211431 | 11/25 | Joey Tribiani    |
      | ScreenSaver | 2        | Rachel Green     | Phalangie st  | New York | NY    | 74566 | Visa   | 5434212112211211 | 11/27 | Rachel Green     |
      | MyMoney     | 5        | Chandler Bing    | Cherry st     | New York | NY    | 34223 | Visa   | 6734212112211211 | 05/24 | Chandler Bing    |
      | FamilyAlbum | 9        | Dr.Drake Ramory  | Berry Parkway | New York | NY    | 54323 | Visa   | 8711122112342201 | 07/34 | Dr.Drake Ramory  |
      | ScreenSaver | 19       | Monica Geller    | Eric st       | New York | NY    | 54545 | Visa   | 8712122111211234 | 08/33 | Monica Geller    |
      | MyMoney     | 4        | Ross Geller      | 5 th avenue   | New York | NY    | 65656 | Visa   | 8912122111211234 | 12/22 | Ross Geller      |
      | MyMoney     | 7        | Regina Phalangie | Soho st       | New York | NY    | 56565 | Visa   | 9811122112342201 | 01/24 | Regina Phalangie |




