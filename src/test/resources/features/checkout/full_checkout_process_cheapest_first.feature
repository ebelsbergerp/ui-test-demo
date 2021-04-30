Feature: Saucedemo full checkout process (cheapest)

  Scenario: Full checkout process of the cheapest product
    Given Peter is visiting the saucedemo login page
    When he logs in with 'standard_user' and 'secret_sauce'
    And he has successfully logged into the webshop
    And he sorts the products by price so that he can see the 'cheapest' product first
    And he adds cheapest product to the cart
    And he navigates to the cart
    And he clicks on checkout button
    And he enters his details
      | first-name  | Max        |
      | last-name   | Mustermann |
      | postal-code | 1100       |
    And he clicks on continue button
    And he clicks on the finish button to successfully close the order
    Then he completed the checkout




