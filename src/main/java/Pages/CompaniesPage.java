package Pages;

import constants.locators.CompaniesPageConstants;
import constants.locators.SearchPageConstants;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CompaniesPage {
    private WebDriver driver;
    private By DDFilterListBy = By.className(CompaniesPageConstants.DDFilterList);
    private By filteredListBy = By.className(CompaniesPageConstants.FilteredList);
    private By filterResultBy = By.className(CompaniesPageConstants.FilterResult);
    private By titleOfItemBy = By.cssSelector(CompaniesPageConstants.TitleOfItem);

    public CompaniesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void NavigateToCompaniesPage() {
        driver.get("https://haycar.am/en/company-list");

    }
    public void ClickToFilter(){
        driver.findElement(DDFilterListBy).click();

    }
    public String GetFilterTypes(int indexOfFilter){
        List<WebElement> Filters = driver.findElements(filteredListBy);
        String type = "";
        for(WebElement x: Filters){
           if(Filters.indexOf(x) == indexOfFilter){
               type=x.getText();
               return type;
           }
           else {
               return "Unknown filer";
           }
        }
        return type;
    }


    public void SelectFilter(int indexOfFilter) {
        List<WebElement> Filters = driver.findElements(filteredListBy);
        Filters.get(indexOfFilter).click();
    }


    public void FilterResult(int indezOfItem) {
        List<WebElement> results = driver.findElements(filterResultBy);
        results.get(indezOfItem).click();
    }
   public String getTitle(){
       String title = driver.findElement(titleOfItemBy).getText();
       return title;

   }
   public boolean CheckResult(){
        if (getTitle().contains(GetFilterTypes(3))) {
           return true;
       }
            else{
                return false;
           }
       }
   }

