package at.tschmidt.jquerynotdefined;

import io.cucumber.java.en.Given;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class SomePageStepDefinitions extends UIInteractionSteps {

    SomePageObject somePageObject;

    @Given("user is on the redirecting page")
    public void userIsOnTheRedirectingPage() {
        somePageObject.open();
    }
}
