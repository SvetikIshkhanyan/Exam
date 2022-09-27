package Pages;

import constants.locators.SearchPageConstants;
import constants.locators.SignUpPageConstants;
import io.netty.util.Signal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;
    private By nameBy = By.id(SignUpPageConstants.Name);
    private By lastNameBy = By.id(SignUpPageConstants.LastName);
    private By emailBy = By.id(SignUpPageConstants.Email);
    private By passwordBy = By.id(SignUpPageConstants.Password);
    private By confirmPasswordBy = By.id(SignUpPageConstants.ConfirmPassword);
    private By captchaBy = By.id(SignUpPageConstants.Captcha);
    private By registerSuccessBy = By.className((SignUpPageConstants.RegisterSuccess));

    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }
    public void NavigateToSignUpPage(){
        driver.get("https://haycar.am/en/signup");

    }


    //fillName
    public void FillName(String NameOfSignup) {
        driver.findElement(nameBy).sendKeys(NameOfSignup);
    }

    //fillLastName
    public void FillLastName(String lNameofsignup) {
        driver.findElement(lastNameBy).sendKeys(lNameofsignup);
    }

    //fillEmail
    public void FillEmail(String EmailOfSignup){
        driver.findElement(emailBy).sendKeys(EmailOfSignup);
    }

    //fillPassword
    public void FillPassword(String PasswordOfSignup){
        driver.findElement(passwordBy).sendKeys(PasswordOfSignup);
    }

    //fillConfirmPassword
    public void FillConfirmPassword(String ConPasswordOfSignup){
        driver.findElement(confirmPasswordBy).sendKeys(ConPasswordOfSignup);
    }

    //CkeckCaptcha
    public void CkeckCaptcha(){
        driver.findElement(captchaBy).click();
    }

}