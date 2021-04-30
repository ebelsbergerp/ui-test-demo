Feature: Saucedemo full checkout process (most expensive ones)

  @ignore
  Scenario: Full checkout process of the most expensive product
    Given Erika is visiting the saucedemo login page
    When she logs in with 'standard_user' and 'secret_sauce'
    And she has successfully logged into the webshop
    And she sorts the products by price so that he can see the 'most expensive' product first
    And she adds cheapest product to the cart
    And she navigates to the cart
    And she clicks on checkout button
    And she enters his details
      | first-name  | Erika      |
      | last-name   | Musterfrau |
      | postal-code | 1200       |
    And she clicks on continue button
    And she clicks on the finish button to successfully close the order
    Then she completed the checkout




