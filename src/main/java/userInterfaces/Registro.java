package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registro {
    public static final Target txtFirstName = Target.the("Caja de texto del nombre").located(By.name("firstName"));
    public static final Target txtLastName = Target.the("Caja de texto del apellido").located(By.name("lastName"));

    public static final Target txtPhone = Target.the("Caja de texto del celular").located(By.name("phone"));

    public static final Target txtEmail = Target.the("Caja de texto del email").located(By.name("userName"));
    public static final Target txtAddress = Target.the("Caja de texto de la direccion").located(By.name("address1"));
    public static final Target txtCity = Target.the("Caja de texto de la ciudad").located(By.name("city"));
    public static final Target txtStateProvince = Target.the("Caja de texto de estado").located(By.name("state"));
    public static final Target txtPostalCode = Target.the("Caja de texto del correo postal").located(By.name("postalCode"));
    public static final Target dropCountry = Target.the("dropdown del pais").located(By.name("country"));
    public static final Target lstCountry = Target.the("dropdown del pais").locatedBy("//option[contains(text(),'PERU')]");
    public static final Target txtUserName = Target.the("Caja de texto del username").located(By.id("email"));
    public static final Target txtPassword = Target.the("Caja de texto del password").located(By.name("password"));
    public static final Target txtConfirmPassword = Target.the("Caja de texto de la confirmacion del password").located(By.name("confirmPassword"));
    public static final Target btnEnviar = Target.the("boton de enviar").located(By.name("submit"));
}
