package ecx.io.webshop;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Map;


public class Checkout {

    public static Target TITLE = Target.the("headline field")
            .locatedBy(".title");

    public static Target CHECKOUT_BUTTON = Target.the("Checkout")
            .locatedBy("#checkout");

    public static Target CONTINUE_BUTTON = Target.the("Continue")
            .locatedBy("#continue");

    public static Target FINISH_BUTTON = Target.the("Finish")
            .locatedBy("#finish");

    public static Performable proceedToCheckout() {
        return Task.where("Process with checkout", Click.on(CHECKOUT_BUTTON)
        );
    }

    public static Performable continueToCheckout() {
        return Task.where("Continue with checkout", Click.on(CONTINUE_BUTTON)
        );
    }

    public static Performable finishTheCheckout() {
        return Task.where("Continue with checkout", Click.on(FINISH_BUTTON)
        );
    }

    public static Performable enterDetails(Map<String, String> details) {
        return Task.where("user enters details",
                enterInto(details, "first-name"),
                enterInto(details, "last-name"),
                enterInto(details, "postal-code")
        );
    }

    private static EnterValue enterInto(Map<String, String> details, String fieldName) {
        return Enter.theValue(details.get(fieldName)).into("#" + fieldName);
    }


}
