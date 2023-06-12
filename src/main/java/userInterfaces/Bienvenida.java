package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Bienvenida {
    public static final Target LBL_USER_NAME = Target.the("Caja de texto del nombre").located(By.xpath("//b[contains(text(),'Note')]"));


}
