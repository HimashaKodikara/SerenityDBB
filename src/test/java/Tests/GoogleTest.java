package Tests;

import Steps.GoogleSteps;
import io.cucumber.junit.CucumberSerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@RunWith(CucumberSerenityRunner.class)
public class GoogleTest {

    @Steps
    GoogleSteps googleSteps;

    @Managed(driver="chrome")
    WebDriver drive;

    Properties prop=new Properties();

    @Test
    public void TestGoogle() throws IOException {
        prop.load(new FileInputStream("src/main/resources/testdata.properties"));
       googleSteps.launchGoogleApp();
       googleSteps.searchItem(prop.getProperty("searchItem"));
       googleSteps.collectItem();
       googleSteps.selectItem(prop.getProperty("selectItem"));
    }
}
