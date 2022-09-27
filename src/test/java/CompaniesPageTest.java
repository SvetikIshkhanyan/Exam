import Pages.CompaniesPage;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.beans.Transient;

public class CompaniesPageTest extends BaseTest {
    @Test
    public void clickFilterOption() throws InterruptedException {
        CompaniesPage companiesPage = new CompaniesPage(driver);
       // Thread.sleep(200);
        companiesPage.NavigateToCompaniesPage();
        companiesPage.ClickToFilter();
        companiesPage.SelectFilter(3);
        companiesPage.FilterResult(4);
        companiesPage.getTitle();
        Assert.assertEquals(true,companiesPage.CheckResult(), "filter is not working");

    }
}