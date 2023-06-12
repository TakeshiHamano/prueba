package stepDefinitions;


import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import questions.ShowUser;
import tasks.*;
import userInterfaces.Home;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static userInterfaces.Bienvenida.LBL_USER_NAME;
import static userInterfaces.Home.lnkRegister;
import static userInterfaces.Registro.btnEnviar;


public class RegistroSteps {
    @Managed(driver = "chrome")

    private WebDriver navegador;

    private Actor actor = Actor.named("Takeshi");


    private Home home = new Home();


    @Given("^La URL esta activa$")
    public void laURLEstaActiva() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(home));
    }

    @And("^el usuario da click en register$")
    public void elUsuarioDaClickEnRegister() {
        actor.wasAbleTo(Click.on(lnkRegister));
    }

    @When("^el usuario registra el (.*), (.*), (.*), (.*)$")
    public void elUsuarioRegistraEl(String c1,String c2,String c3,String c4) {
        actor.wasAbleTo(
                RegistrarContact.contenido(c1, c2, c3, c4)
        );
    }

    @And("^el usuario ingresa mailing (.*), (.*), (.*), (.*), (.*)$")
    public void elUsuarioIngresaMailing(String ca1,String ca2,String ca3,String ca4, String ca5) {
        actor.wasAbleTo(
                RegistrarMailing.contenido(ca1, ca2, ca3, ca4, ca5)
        );
    }

    @And("^el usuario ingresa user (.*), (.*), (.*)$")
    public void elUsuarioIngresaUser(String c1,String c2,String c3) {
        actor.wasAbleTo(
                RegistarUser.contenido(c1,c2,c3)
        );
    }

    @And("^el usuario da click en el boton enviar$")
    public void elUsuarioDaClickEnElBotonEnviar() {

        actor.wasAbleTo(Click.on(btnEnviar));
    }

    @Then("^se muestra el nombre del usuario (.*)$")
    public void seMuestraElNombreDelUsuario(String userName) {
        actor.should(seeThat(ShowUser.name(LBL_USER_NAME), containsString(userName)));
    }

}
