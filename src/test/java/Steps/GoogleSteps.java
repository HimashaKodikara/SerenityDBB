package Steps;

import Pages.GooglePage;
import net.thucydides.core.annotations.Step;

public class GoogleSteps {

    GooglePage googlePage;
    @Step
    public void launchGoogleApp()
    {
        googlePage.open();
    }
    @Step
    public void searchItem(String input){
         googlePage.searchItem(input);
    }
    @Step
    public void collectItem(){
         googlePage.collectItems();
    }
    @Step
    public void selectItem(String input){
         googlePage.selectItem(input);
    }

}
