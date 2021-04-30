package ecx.io.stepdefinitions;

import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @ParameterType("Name ascending|Name descending|cheapest|most expensive")
    public static int selected_order(String input) {
        switch (input.toLowerCase()) {
            case "name ascending":  return 0;
            case "name descending": return 1;
            case "cheapest": return 2;
            case "most expensive": return 3;
            default: return -1;

        }
    }
}
