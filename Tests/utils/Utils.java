package Tests.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils{
    public WebDriver _driver;
    public WebDriverWait wait;
    public Utils()
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\Drivers\\chromedriver.exe");
        _driver = new ChromeDriver();
    }
    public void navigateToUrl(String URL)
    {
        _driver.navigate().to(URL);
    }
    //Clicking element

    public void click(By Selector)
    {
        WebElement element= getElement(Selector);
        element.click();

    }
    //Clear Text form inout box/area

    public void clearField(WebElement element)
    {
        element.clear();

    }
    //Enter text in input field
    public void SendKeys(By Selector, String value)
    {
    WebElement element=getElement(Selector);
    clearField(element);
    element.sendKeys(value);
    }
    //Clear and enter text in input field

    //Checking WebElemnt present in DOM
    public WebElement getElement(By Selector)
    {

      WebElement element=   _driver.findElement(Selector);
      return element;
    }
    public void ActionCategory(By Selector1,By Selector2 )
    {
        Actions action=new Actions(_driver);
        WebElement element1=getElement(Selector1);
        WebElement element2=getElement(Selector2);
        action.moveToElement(element1).moveToElement(element2).click().build().perform();
    }

    //Checking WebElemnt displayed or not


    //Wait for fixed time given in seconds




    //Try to click element three times if not available in first go

    //isdorpdown present


    //Wait for locator to be clickable for given time in seconds

    //Wait for element to be clickable for given time in seconds

    //date stamp short

    //date stamp long


    //Wait for element for given time in second

    //wait for element to be invisible


    // select from visible text

    //Select from visible number


    //Select from value

    // get selected value from dropdown
        public String getSelectedDropDownValue(WebElement element)
        {
          Select objselect=new Select(element);
            WebElement  option =objselect.getFirstSelectedOption();
          return   option.getText();
        }

    //Scroll to view element


    //Scroll to element and click

    //Wait for alert to display

    //Get attribute of element


    //get css property of element

    //take screenshot of browser


    //take screenshot of current display(full)


    //convert date....


}
