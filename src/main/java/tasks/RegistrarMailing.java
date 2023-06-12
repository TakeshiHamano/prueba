package tasks;

import interactions.Dropdown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterfaces.Registro.*;

public class RegistrarMailing implements Task {

    private String ca1;
    private String ca2;
    private String ca3;
    private String ca4;
    private String ca5;

    public RegistrarMailing(String ca1,String ca2,String ca3,String ca4, String ca5){

        this.ca1 = ca1;
        this.ca2 = ca2;
        this.ca3 = ca3;
        this.ca4 = ca4;
        this.ca5 = ca5;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ca1).into(txtAddress),
                Enter.theValue(ca2).into(txtCity),
                Enter.theValue(ca3).into(txtStateProvince),
                Enter.theValue(ca4).into(txtPostalCode),
                Click.on(dropCountry),
                Dropdown.elegirPorItem(lstCountry,ca5)
        );
    }
    public static RegistrarMailing contenido(String ca1,String ca2,String ca3,String ca4, String ca5){
        return instrumented(RegistrarMailing.class, ca1,ca2,ca3,ca4,ca5);
    }
}
