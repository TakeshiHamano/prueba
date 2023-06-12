package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.Registro.*;

public class RegistarUser implements Task{
    private String c1;
    private String c2;
    private String c3;

    public RegistarUser(String c1,String c2,String c3){

        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(c1).into(txtUserName),
                Enter.theValue(c2).into(txtPassword),
                Enter.theValue(c3).into(txtConfirmPassword)
        );
    }
    public static RegistarUser contenido(String c1,String c2,String c3){

        return instrumented(RegistarUser.class, c1,c2,c3);
    }
}
