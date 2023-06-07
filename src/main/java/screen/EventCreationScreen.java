package screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import util.Commons;

public class EventCreationScreen {
	
	
    @FindBy(xpath="//*[text()='Create Event']")
    @CacheLookup
    protected WebElement createEvent;

    @FindBy(id="eventName")
    @CacheLookup
    protected WebElement eventName;

    @FindBy(id="eventNickname")
    @CacheLookup
    protected WebElement eventNickName;

    @FindBy(id="exampleFormControlTextarea1")
    @CacheLookup
    protected WebElement eventDesc;

    @FindBy(xpath="(//div[@class='react-switch-bg'])[1]")
    @CacheLookup
    protected WebElement eventVisibility;

    @FindBy(xpath="(//div[@class='react-switch-bg'])[2]")
    @CacheLookup
    protected WebElement eventStandardization;

    @FindBy(xpath="(//div[@class='react-switch-bg'])[3]")
    @CacheLookup
    protected WebElement eventPriortization;

    @FindBy(xpath="(//button[@class='Image_Uploader'])[1]")
    @CacheLookup
    protected WebElement imageUploader;

    @FindBy(xpath="(//button[@class='Image_Uploader'])[12]")
    @CacheLookup
    protected WebElement imageUploader2;

    @FindBy(xpath="//label[text()='Start Time']//following::button[1]")
    @CacheLookup
    protected WebElement startTime;

    @FindBy(xpath="//label[text()='End Time']//following::button[1]")
    @CacheLookup
    protected WebElement endTime;

    @FindBy(xpath="//label[text()='Actual Event Time']//following::button[1]")
    @CacheLookup
    protected WebElement actualStartTime;
    
    @FindBy(xpath="(//li[@class='react-datepicker__time-list-item '])[1]")
    @CacheLookup
    protected WebElement nextAvailableStartTime;

    @FindBy(xpath="(//li[@class='react-datepicker__time-list-item '])[6]")
    @CacheLookup
    protected WebElement nextAvailableEndTime;

    @FindBy(xpath="(//li[@class='react-datepicker__time-list-item '])[7]")
    @CacheLookup
    protected WebElement nextAvailableActualStartTime;

    @FindBy(xpath="//input[@class='Color_Picker']")
    @CacheLookup
    protected WebElement colorPicker;
}
