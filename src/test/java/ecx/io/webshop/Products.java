package ecx.io.webshop;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

public class Products {

    public static final Target PRODUCT_SORT_CONTAINER = Target.the("sort option")
            .locatedBy(".product_sort_container");

    public static Target HEADLINE_FIELD = Target.the("headline field")
            .locatedBy(".title");

    public static final Target FIRST_ITEM_BUTTON = Target.the("headline field")
            .locatedBy("//*[@id=\"inventory_container\"]//*[@class=\"inventory_item\"][1]//button");

    public static final Target CART_CONTAINER = Target.the("Cart container")
            .locatedBy("#shopping_cart_container");


    public static Performable sortByCheapest(Integer SortOrder) {
        return Task.where("{0} sort by price asc", SelectFromOptions.byIndex(SortOrder)
                .from(PRODUCT_SORT_CONTAINER)
        );
    }

    public static Performable navigateToCart() {
        return Task.where("Navigate to cart", Click.on(CART_CONTAINER)
        );
    }

    public static Performable selectCheapestItem() {
        return Task.where("Add cheapest product to cart", Click.on(FIRST_ITEM_BUTTON));
    }

}
