package Pages;

import constants.locators.ServicesPageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ServicesPage {
    private WebDriver driver;
    private By serviceListBy = By.className(ServicesPageConstants.ServiceList);
    private By serviceDataBy = By.id(ServicesPageConstants.ServiceData);

    public ServicesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void NavigateToServicePage() {
        driver.get("https://haycar.am/en/services");

    }
//Choose one of Services
    public void ChooseService(int indexOfService) {
        List<WebElement> serviceList = driver.findElements(serviceListBy);
        serviceList.get(indexOfService).click();
//        int size = serviceList.size();
//        System.out.println("fgfjhgkjjjkjkgjgjhgjhgjhgjhgjhgjhgjhjh" + size);
        }
        public Boolean CheekServiceIsNotEmpty(){
        driver.findElement(serviceDataBy).click();
        return true;
        }


    }




