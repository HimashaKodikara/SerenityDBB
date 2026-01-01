package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GooglePage extends PageObject {

    @FindBy(name="g")
    WebElement searchBar;

    @FindBy(xpath="//ul[@role='listbox']")
    WebElement dropDownList;

    By dropDownElements= By.xpath("//li[ontains(@class.'sbct')]/descendant::div[@role='option']");

    List<WebElement> dropDownElementsList;
    public void searchItem(String input)
    {
        searchBar.sendKeys(input);
    }

    public void collectItems()
    {
        dropDownElementsList= dropDownList.findElements(dropDownElements);
    }

    public void selectItem(String searchItem)
    {
        for(WebElement element:dropDownElementsList)
        {
            if(element.getAttribute("aria-label").equals(searchItem));
            {
                element.click();
                break;
            }
        }
    }


}
