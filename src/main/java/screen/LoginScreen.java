package screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;

public class LoginScreen {

    @FindBy(id="email")
    @CacheLookup
    protected WebElement userName;

    @FindBy(id="password")
    @CacheLookup
    protected WebElement passWord;

    @FindBy(xpath="//button[@class='login-button Disabled']")
    @CacheLookup
    protected WebElement login;

    @FindBy(xpath="//button[@class='login-button']")
    @CacheLookup
    protected WebElement login_withCorrectEmailFormat;

    @FindBy(xpath="//div[text()='Password is required.']")
    @CacheLookup
    protected WebElement blankPasswordPrompt;

    @FindBy(xpath="//div[text()='Invalid email address.']")
    @CacheLookup
    protected WebElement wrongEmailFormatPrompt;

    @FindBy(xpath="//*[text()='Error']")
    @CacheLookup
    protected WebElement toast;

    @FindBy(xpath="//a[text()='Forgot Password ?']")
    @CacheLookup
    protected WebElement forgotPassword;

    @FindBy(xpath="//input[@type='email']")
    @CacheLookup
    protected WebElement userNameForgotten;

    @FindBy(xpath="//button[@type='submit']")
    @CacheLookup
    protected WebElement proceedButton;

    @FindBy(xpath="//button[@type = 'button']")
    @CacheLookup
    protected WebElement passwordResetRequestedButton;
}
