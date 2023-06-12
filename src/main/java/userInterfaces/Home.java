package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class Home extends PageObject {
    public static final Target lnkRegister = Target.the("Link de Register").located(By.linkText("REGISTER"));
}