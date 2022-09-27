import Pages.ServicesPage;
import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ServicePageTest extends BaseTest {

    @Test
    public void checkServiceOption() throws InterruptedException{
        ServicesPage servicesPage = new ServicesPage(driver);
        Thread.sleep(200);
        servicesPage.NavigateToServicePage();
        servicesPage.ChooseService(3);
        Assert.assertEquals(true, servicesPage.CheekServiceIsNotEmpty());
    }
}
