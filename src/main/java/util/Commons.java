package util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Commons {

    DriverFactory df = new DriverFactory();
    WebDriver driver = df.getDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(52));
    Select s;

    public String getStartDate()
    {
    	DateFormat dateFormat = new SimpleDateFormat("EEEEE, MMMMM d,yyyy");
        Calendar c = Calendar.getInstance();
        
        //Increased Date by 1
        c.add(Calendar.DATE,1);
        String modifiedDate = dateFormat.format(c.getTime());
        System.out.println("Date incremented by 1 :"+modifiedDate);
        
        String prt1 = modifiedDate.substring(0,modifiedDate.lastIndexOf(","));
        System.out.println(prt1);
        return prt1;
    }
    
    public String getEndDate()
    {
    	DateFormat dateFormat = new SimpleDateFormat("EEEEE, MMMMM d,yyyy");
        Calendar c = Calendar.getInstance();
        
        //Increased Date by 4
        c.add(Calendar.DATE,4);
        String modifiedDate = dateFormat.format(c.getTime());
        System.out.println("Date incremented by 4 :"+modifiedDate);
        
        String prt2 = modifiedDate.substring(0,modifiedDate.lastIndexOf(","));
        System.out.println(prt2);
        return prt2;
    }
    
    public String getActualStartDate()
    {
    	DateFormat dateFormat = new SimpleDateFormat("EEEEE, MMMMM d,yyyy");
        Calendar c = Calendar.getInstance();
        
        //Increased Date by 2
        c.add(Calendar.DATE,2);
        String modifiedDate = dateFormat.format(c.getTime());
        System.out.println("Date incremented by 2 :"+modifiedDate);
        
        String prt3 = modifiedDate.substring(0,modifiedDate.lastIndexOf(","));
        System.out.println(prt3);
        return prt3;
    }

    public void scrollDownToBottom()
    {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public void scrollDownTillElement(WebElement element)
    {
        element.sendKeys(Keys.PAGE_DOWN);
    }

    public void scrollDownSlightly()
    {
        js.executeScript("window.scrollBy(0,520)", "");
    }

    public void scrollDownVerySlightly()
    {
        js.executeScript("window.scrollBy(0,5)", "");
    }

    public void refreshForStaleness(WebElement element)
    {
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    public void isElementClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void selectByIndex(WebElement element,int index)
    {
        s = new Select(element);
        s.selectByIndex(index);
    }

    public void selectByValue(WebElement element,String val)
    {
        s = new Select(element);
        s.selectByValue(val);
    }

    public void selectByText(WebElement element,String txt)
    {
        s = new Select(element);
        s.selectByVisibleText(txt);
    }

    public WebElement below(WebElement element)
    {
        return(driver.findElement(with(By.tagName("button")).below(element)));
    }
}
