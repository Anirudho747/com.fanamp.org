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

    @FindBy(xpath="(//div[@class=' css-19bb58m'])[1]")
    @CacheLookup
    protected WebElement symbolButton;

    @FindBy(xpath="//*[text()='Practice']")
    @CacheLookup
    protected WebElement practiceSymbol;

    @FindBy(xpath="(//div[@class=' css-19bb58m'])[2]")
    @CacheLookup
    protected WebElement seasonButton;

    @FindBy(xpath="//*[text()='2022-23 [Formula 1]']")
    @CacheLookup
    protected WebElement formula1Symbol;

    @FindBy(xpath="(//div[@class=' css-19bb58m'])[3]")
    @CacheLookup
    protected WebElement eventGroupButton;

    @FindBy(xpath="//*[text()='Australian Prix']")
    @CacheLookup
    protected WebElement autralianPrix;

    @FindBy(xpath="(//div[@class='flex-grow-1'])[2]")
    @CacheLookup
    protected WebElement categoryFormula1;

    @FindBy(xpath="//button[@type='submit' and text()='Save']")
    @CacheLookup
    protected WebElement saveButton;

    @FindBy(xpath="//button[@type='submit' and text()='Next']")
    @CacheLookup
    protected WebElement nextButton;

    @FindBy(xpath="//button[@type='submit' and text()='Exit']")
    @CacheLookup
    protected WebElement exitButton;
}
