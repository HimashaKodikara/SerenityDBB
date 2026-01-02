package Tests;

import Steps.GoogleSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@ExtendWith(SerenityJUnit5Extension.class)
public class GoogleTest {

    @Steps
    GoogleSteps googleSteps;

    @Managed(driver = "chrome")
    WebDriver driver;

    Properties prop = new Properties();

    @Test
    public void TestGoogle() throws IOException {
        prop.load(new FileInputStream("src/main/resources/testdata.properties"));

        googleSteps.launchGoogleApp();
        googleSteps.searchItem(prop.getProperty("searchItem"));
        googleSteps.collectItem();
        googleSteps.selectItem(prop.getProperty("selectItem"));
    }
}
