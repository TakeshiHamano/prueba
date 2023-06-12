package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;


public class ShowUser implements Question<String> {
    private final Target target;

    public ShowUser(Target target) {
        this.target = target;
    }

    public static Question<String> name(Target target){
        return actor -> target.resolveFor(actor).getText();
    }

    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(target).viewedBy(actor).asString();
    }
}
