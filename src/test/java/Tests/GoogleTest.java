package Tests;

import Steps.GoogleSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class GoogleTest {

    @Steps
    GoogleSteps googleSteps;

    @Managed(driver="chrome")
    WebDriver drive;

    @Test
    public void TestGoogle(){
       googleSteps.launchGoogleApp();
       googleSteps.searchItem("");
       googleSteps.collectItem();
       googleSteps.selectItem("");
    }
}
