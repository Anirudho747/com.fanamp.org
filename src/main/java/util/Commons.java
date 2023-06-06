package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;


public class Commons {

    DriverFactory df = new DriverFactory();
    WebDriver driver = df.get_driver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(52));

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
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollDownTillElement(WebElement element)
    {
         js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollDownSlightly()
    {
        js.executeScript("window.scrollBy(0,240)", "");
    }

    public void refreshForStaleness(WebElement element)
    {
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    public void isElementClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
