package Pages;

import constants.locators.SearchPageConstants;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    private WebDriver driver;
    private By DDMenuListBy = By.className(SearchPageConstants.DDMenuList);
    private By DDMakeListBy = By.className(SearchPageConstants.DDMakeList);
    private By DDYearListBy = By.className(SearchPageConstants.DDYearList);
    private By yearResultListBy = By.className(SearchPageConstants.YearResultList);
    private By searchButtonBy = By.id(SearchPageConstants.SearchButton);
    private By searchResultBy = By.id(SearchPageConstants.SearchResult);
    private By searchResultItemsBy = By.cssSelector(SearchPageConstants.SearchResultList);

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ChooseMenu(int indexOfMenu) {
        List<WebElement> DDMenuList = driver.findElements(DDMenuListBy);
        DDMenuList.get(indexOfMenu).click();

        //  driver.findElement(By.linkText("MakeText")).click();

    }

    public void ChooseMake(int indexOfMake) {
        List<WebElement> DDMakeList = driver.findElements(DDMakeListBy);
        DDMakeList.get(indexOfMake).click();
    }
    public void ChooseYearFrom(int indexOfModel) {
        List<WebElement> DDModelList = driver.findElements(DDYearListBy);
        DDModelList.get(indexOfModel).click();
    }

    public int GetYear(int indexOfFilter) {
        ChooseMenu(2);
        List<WebElement> Years = driver.findElements(DDYearListBy);
        String year = "";
        Integer numYear = null;
        for (WebElement x : Years) {
            if (Years.indexOf(x) == indexOfFilter) {
                year = x.getText();
                numYear = Integer.parseInt(year);
                return numYear;
            } else {
                return 0;
            }
        }
        return numYear;
    }



    public void ClickSearchButton() {
        driver.findElement(searchButtonBy).click();
    }

    public void SearchResult() {
        List<WebElement> Result = driver.findElements((searchResultBy));
    }

    public boolean ClickSearchResult(int indexOfElem, String result) {
        List<WebElement> SearchResult = driver.findElements(searchResultItemsBy);
        String name = SearchResult.get(indexOfElem).getText();
        if (name.contains(result)) {
            return true;
        } else {
            return false;
        }
    }

    public List<Integer> getYearOfCar() {
        List<WebElement> yearResult = driver.findElements(yearResultListBy);
        //String name = yearResult.getText();
        String year = "";
        Integer y = null;
        String nyear = "";
        List<Integer> Years = new ArrayList<>();
        for (WebElement x : yearResult) {
           year = x.getText();
           nyear = year.replace(", ","");
            y = Integer.parseInt(nyear);
            // List <Integer> Years = new ArrayList<>();
            Years.add(y);
        }

        return Years;
    }

    public boolean checkYear() {
        for (int a : getYearOfCar()) {
            if(GetYear(7) <= a) {
                return true;
            }
        }
        return false;
    }


//public void checkYear() {
//    for (int a : getYearOfCar()) {
//        System.out.println((a));
//    }
//}
}




