import Pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpPageTest extends BaseTest {


    @Test
    public void signUpOption() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.NavigateToSignUpPage();
        signUpPage.FillName("AnnA");
        signUpPage.FillLastName("Vardanyan");
        signUpPage.FillEmail("rrr@mailinator.com");
        signUpPage.FillPassword("123456Aa..");
        signUpPage.FillConfirmPassword("123456Aa..");
        signUpPage.CkeckCaptcha();
    }
}