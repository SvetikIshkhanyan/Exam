package Pages;

import constants.locators.RentPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RentPage {
    private WebDriver driver;
   // private By rentBus = By.xpath(RentPageConstants.RentBus);
    private By category = By.name(RentPageConstants.Category);
    private By make = By.name(RentPageConstants.Make);
    private By rentSearchButton = By.id(RentPageConstants.RentSearchButton);

    public RentPage(WebDriver driver){
        this.driver = driver;
    }

    public void ClickToSerachButton(){
      driver.findElement(rentSearchButton).click();
    }
    public void ChooseCategory(){
        Select CATEGORY = new Select(driver.findElement(category));
        CATEGORY.selectByValue("Bus");
    }
    public void ChooseModel(){
        Select MAKE = new Select(driver.findElement(make));
        MAKE.selectByValue("IVECO");
    }

}

