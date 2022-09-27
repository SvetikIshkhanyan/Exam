import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class BaseTest {
    static WebDriver driver;

    @BeforeClass
    public void initWebDriver() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://haycar.am/en");
        driver.manage().window().maximize();
    }
//    @AfterClass
//       public static void afterclass() {
//            driver.quit();
//        }
}
