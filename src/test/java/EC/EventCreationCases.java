package EC;

import flow.EventCreationFlow;
import flow.LoginFlow;
import flow.NotificationFlow;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class EventCreationCases {

    public EventCreationFlow eventCreationFlow;
    public NotificationFlow nf;
    public LoginFlow lf;
    public DriverFactory df;
    public WebDriver driver;

    @Before(order=0)
    public void setUp()
    {
          df = new DriverFactory();
          driver = df.getDriver();
          lf = new LoginFlow(driver);

          nf = new NotificationFlow(driver);

        df.launchPage();
        System.out.println(driver.getTitle());

        lf.enterUserName("anirudho@auberginesolutions.com");
        lf.enterPassword("Gmail@2023");
        lf.tapLogin_withCorrectEmailFormat();
    }

    @Given("User is at Event List screen")
    public void user_is_at_event_list_screen() {
        //Assert Screen title here
    }

    @When("User taps on Create Event Button")
    public void user_taps_on_create_event_button() {
        System.out.println("Line 45 ");
        eventCreationFlow = new EventCreationFlow(driver);
        eventCreationFlow.tapCreateEvent();
    }

    @When("Enters Event Name")
    public void enters_event_name() {
        eventCreationFlow.typeEventName();
    }

    @When("Enters Nickname")
    public void enters_nickname() {
        eventCreationFlow.typeEventNickName();
    }

    @When("Enters Description")
    public void enters_description() {
        eventCreationFlow.typeEventDesc();
    }

    @When("sets visibility,priority")
    public void sets_visibility_priority() {
        eventCreationFlow.makeEventVisible();
    }

    @When("sets Event schedule")
    public void sets_event_schedule() {
        eventCreationFlow.selectEventStartDate();
        eventCreationFlow.selectEventEndDate();
        eventCreationFlow.selectActualStartDate();
    }

    @When("uploads Image")
    public void uploads_image() {

    }

    @When("picks Symbol")
    public void picks_symbol() {

    }

    @When("picks Season")
    public void picks_season() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("picks Event Group")
    public void picks_event_group() {

    }

    @When("selects Category")
    public void selects_category() {

    }

    @When("taps on Save Button")
    public void taps_on_save_button() {

    }

    @Then("User gets a confirmatory Toast message")
    public void user_gets_a_confirmatory_toast_message() {

    }

}
