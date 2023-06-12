package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.Registro.*;


public class RegistrarContact implements Task {
    private String c1;
    private String c2;
    private String c3;
    private String c4;

    public RegistrarContact(String c1,String c2,String c3,String c4){

        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(c1).into(txtFirstName),
                Enter.theValue(c2).into(txtLastName),
                Enter.theValue(c3).into(txtPhone),
                Enter.theValue(c4).into(txtEmail)
        );
    }
    public static RegistrarContact contenido(String c1,String c2,String c3,String c4){
        return instrumented(RegistrarContact.class, c1,c2,c3,c4);
    }
}
