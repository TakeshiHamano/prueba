package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitElementPresent implements Interaction {

    private final Target target;

    public WaitElementPresent(Target target) {
        this.target = target;
    }

    @Override
    @Step("{0} wait for element")
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).waitUntilPresent();
    }

    public static WaitElementPresent in(Target target) {
        return instrumented(WaitElementPresent.class, target);
    }
}