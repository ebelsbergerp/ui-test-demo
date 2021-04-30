Feature: Login

  Scenario: Login Scenario only with normal user
    Given Claus is visiting the saucedemo login page
    When he logs in with 'standard_user' and 'secret_sauce'
    Then he has successfully logged into the webshop

  Scenario: Login Scenario only with slow user
    Given Claus is visiting the saucedemo login page
    When he logs in with 'performance_glitch_user' and 'secret_sauce'
    Then he has successfully logged into the webshop

  Scenario: Login Scenario only with problem user
    Given Claus is visiting the saucedemo login page
    When he logs in with 'problem_user' and 'secret_sauce'
    Then he has successfully logged into the webshop

