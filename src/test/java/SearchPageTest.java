import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchPageTest extends BaseTest{

    @Test
    public void clickMakeOption() throws InterruptedException {
       SearchPage searchPage = new SearchPage(driver);
      // driver.findElements(By.className("chosen-single")).get(0).click();
       searchPage.ChooseMenu(0);
       searchPage.ChooseMake(8);
       searchPage.ChooseMenu(2);
       searchPage.ChooseYearFrom(7);
       searchPage.ClickSearchButton();
       searchPage.SearchResult();
      // searchPage.ClickSearchResult(0);
        Assert.assertTrue(searchPage.ClickSearchResult(0, "BMW"));
          Assert.assertTrue(searchPage.checkYear());
        // searchPage.ChooseMake("BMW");
        //searchPage.checkYear();
    }



}
