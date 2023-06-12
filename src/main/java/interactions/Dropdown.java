package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Dropdown implements Interaction {

    private final String value;
    private final Target target;

    public Dropdown(Target target, String value) {
        this.target=target;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> elementList = target.resolveAllFor(actor);
        for (WebElementFacade elementFacade : elementList) {
            if (elementFacade.getTextContent().equals(value)) {
                elementFacade.click();
                break;
            }
        }
    }
    public static Dropdown elegirPorItem(Target target, String value) {
        return instrumented(Dropdown.class,target, value);
    }
}
