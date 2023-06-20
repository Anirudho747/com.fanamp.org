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
        this.driver = driver;
        PageFactory.initElements(driver,this);
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
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        c.scrollDownTillElement(endTime);
        c.isElementClickable(endTime);
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
//        c.below(seasonButton).click();
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

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

          c.isElementClickable(saveButton);
          c.scrollDownSlightly();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         c.scrollDownVerySlightly();
         saveButton.click();

    }
}
