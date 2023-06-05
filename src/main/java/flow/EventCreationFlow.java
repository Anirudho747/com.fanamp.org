package flow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import screen.EventCreationScreen;

public class EventCreationFlow extends EventCreationScreen {

    public WebDriver driver;

    public EventCreationFlow()
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void tapCreateEvent()
    {
        createEvent.click();
    }

    public void typeEventName()
    {
        eventName.clear();
        eventName.sendKeys("QA Automation Event");
    }

    public void typeEventNickName()
    {
        eventNickName.clear();
        eventNickName.sendKeys("QA Automation Event");
    }

    public void typeEventDesc()
    {
        eventDesc.clear();
        eventDesc.sendKeys("QA Automation Event");
    }

    public void makeEventPriority()
    {
        eventVisibility.click();
    }


}
