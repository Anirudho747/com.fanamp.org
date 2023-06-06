package S1;


import flow.LoginFlow;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.DriverFactory;
import java.time.Duration;


public class LoginCases {

    public LoginFlow lf;
    public WebDriver driver;
    public DriverFactory df;

    @Before(order = 0)
    public void setUp()
    {
        df = new DriverFactory();
        driver = df.get_driver();
        lf = new LoginFlow(driver);
    }

    @Given("User is at Login Page")
    public void user_is_at_login_page() {
        df.launchPage();
        System.out.println(driver.getTitle());
    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String string) {
        lf.enterUserName(string);
    }

    @Then("User gets a Validation Message for username")
    public void user_gets_a_validation_message_for_username() {
        lf.isEmailFormatMsgPresent();
    }

    @When("User enters blank password")
    public void user_enters_blank_password() {
        lf.enterPassword("");
    }

    @Then("User gets a Validation Message for password")
    public void user_gets_a_validation_message_for_password() {
        lf.isBlankPasswordMsgPresent();
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String string) {
        lf.enterPassword(string);
    }

    @Then("User should get a Toast notification")
    public void user_should_get_a_toast_notification() {
        lf.tapLogin_withCorrectEmailFormat();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        lf.isToastPresent();
    }

    @Then("User should be redirected to page with title {string}")
    public void user_should_be_redirected_to_page_with_title(String string) {
        lf.tapLogin_withCorrectEmailFormat();
        System.out.println("title is "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Fanamp");
    }

    @When("User taps Forgot Password")
    public void user_taps_forgot_password() {
            lf.clickForgotPassword();
    }

    @When("User enters email Address as {string}")
    public void user_enters_email_address_as(String string) {
            lf.enterEmail(string);
    }

    @When("hits the enter button")
    public void hits_the_enter_button() {
            lf.clickProceed();
    }

    @Then("User should be getting proper response")
    public void user_should_be_getting_proper_response() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Assert.assertEquals(lf.isEmailValid(),true);
    }

    @Then("User should not be getting proper response")
    public void user_should_not_be_getting_proper_response() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Assert.assertEquals(lf.isEmailValid(),false);
    }



    @After(order=0)
    public void tearDown()
    {
        driver.quit();
    }

    }
