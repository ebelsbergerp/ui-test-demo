package ecx.io.stepdefinitions;

import ecx.io.webshop.Checkout;
import ecx.io.login.LoginForm;
import ecx.io.webshop.Products;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import ecx.io.login.NavigateTo;

import java.util.Map;


public class StepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is visiting the saucedemo login page")
    public void is_browsing_to_login_page(Actor consumer) {
        consumer.wasAbleTo(NavigateTo.theSauceDemoPage());
    }

    @When("{actor} logs in with {string} and {string}")
    public void he_logs_in_with_username_and_password(Actor consumer, String username, String password) {
        consumer.attemptsTo(
            LoginForm.enterUsernameAndPassword(username, password)
        );
    }

    @When("{actor} sorts the products by price so that he can see the {string} product first")
    public void he_can_sort_all_products_by_price_to_see_the_cheapest_first(Actor consumer, String order) {
        consumer.attemptsTo(
                Products.sortByCheapest(ParameterDefinitions.selected_order(order))
        );
    }

    @And("{actor} adds cheapest product to the cart")
    public void he_adds_cheapest_product_to_cart(Actor consumer) {
        consumer.attemptsTo(Products.selectCheapestItem());
    }

    @And("{actor} navigates to the cart")
    public void he_navigates_to_the_cart(Actor consumer) {
        consumer.attemptsTo(Products.navigateToCart());
    }

    @And("{actor} clicks on checkout button")
    public void he_clicks_on_checkout_button(Actor consumer) {
        consumer.attemptsTo(Checkout.proceedToCheckout());
    }

    @And("{actor} enters his details")
    public void he_enters_his_details(Actor consumer, Map<String, String> personDetails) {
        consumer.attemptsTo(Checkout.enterDetails(personDetails));
    }


    @And("{actor} clicks on continue button")
    public void he_clicks_on_the_continue_button(Actor consumer) {
        consumer.attemptsTo(Checkout.continueToCheckout());
    }


    @And("{actor} clicks on the finish button to successfully close the order")
    public void he_clicks_on_the_finish_button_to_successfully_close_the_order(Actor consumer) {
        consumer.attemptsTo(Checkout.finishTheCheckout());
    }


    @Then("{actor} completed the checkout")
    public void he_completed_the_checkout(Actor consumer) {
        consumer.attemptsTo(
                Ensure.that(Checkout.TITLE).hasText("CHECKOUT: COMPLETE!")
        );
    }

    @And("{actor} has successfully logged into the webshop")
    public void he_has_successfully_logged_into_the_webshop(Actor consumer) {
        consumer.attemptsTo(
                Ensure.that(Products.HEADLINE_FIELD).hasText("PRODUCTS")
        );
    }

    @And("{actor} _sorts the products by price so that he can see the {string} product first")
    public void _he_sorts_the_products_by_price_so_that_he_can_see_the_most_expensive_product_first(Actor consumer, String order) {
        consumer.attemptsTo(
                Products.sortByCheapest(ParameterDefinitions.selected_order(order))
        );
    }
}
