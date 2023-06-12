package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//import cucumber.api.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        glue = "stepDefinitions",
        tags = "@Ejemplo1"
        //snippets = SnippetType.CAMELCASE
)
public class Runner {

}
