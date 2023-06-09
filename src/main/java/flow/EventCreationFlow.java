package flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import screen.EventCreationScreen;
import util.Commons;

import java.time.Duration;

public class EventCreationFlow extends EventCreationScreen {

    public WebDriver driver;
    Commons c= new Commons();

    public EventCreationFlow(WebDriver driver)
    {
        System.out.println("Line 19 ");
        this.driver = driver;
        System.out.println("Line 21 ");
        PageFactory.initElements(driver,this);
        System.out.println("Line 23 ");
    }

    public void tapCreateEvent()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
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

    public void makeEventVisible()
    {
//        eventVisibility.click();
    }

    public void selectEventStartDate()
    {
        c.scrollDownSlightly();
        c.isElementClickable(startTime);
        startTime.click();
    	
    	//*[contains(@aria-label,'June 6')]
    	String locator1 = "//*[contains(@aria-label,'";
    	String startDate = c.getStartDate();
    	String locator2 = "')]";
    	driver.findElement(By.xpath(locator1+startDate+locator2)).click();
    	nextAvailableStartTime.click();
    }
    
    public void selectEventEndDate()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        c.scrollDownTillElement(colorPicker);
        c.scrollDownToBottom();
    	endTime.click();
    	
    	//*[contains(@aria-label,'June 6')]
    	String locator1 = "//*[contains(@aria-label,'";
    	String endDate = c.getEndDate();
    	String locator2 = "')]";
    	driver.findElement(By.xpath(locator1+endDate+locator2)).click();
     	nextAvailableEndTime.click();
    }
    
    public void selectActualStartDate()
    {
        c.scrollDownVerySlightly();
        c.isElementClickable(actualStartTime);
    	actualStartTime.click();
    	
    	//*[contains(@aria-label,'June 6')]
    	String locator1 = "//*[contains(@aria-label,'";
    	String actualStartDate = c.getActualStartDate();
    	String locator2 = "')]";
    	driver.findElement(By.xpath(locator1+actualStartDate+locator2)).click();
    	nextAvailableActualStartTime.click();
    }

    public void imageUpload()
    {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectSymbol()
    {
       // c.selectByText(symbolDropDown,"Practice");
        symbolButton.click();
        practiceSymbol.click();
    }

    public void selectSeason()
    {
        seasonButton.click();
        formula1Symbol.click();
    }

    public void selectEventGroup()
    {
        eventGroupButton.click();
        autralianPrix.click();
    }

    public void selectCategory()
    {
        categoryFormula1.click();
    }

    public void saveDetails()
    {
        saveButton.click();
    }
}
