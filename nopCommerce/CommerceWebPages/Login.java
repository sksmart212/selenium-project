package nopCommerce.CommerceWebPages;

import Tests.utils.Utils;
import junit.framework.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends Utils
{
    //protected static WebDriver driver;
    private static String PAGE_URL = "https://demo.nopcommerce.com/login";

    public void LoginUser()
    {
    navigateToUrl(PAGE_URL);
    SendKeys(By.id("Email"),"abcefg4@yahoo.com");
    SendKeys(By.id("Password"),"London908911");
    getElement(By.xpath("//input[@class='button-1 login-button' and @value='Log in']")).click();
    String actuactualResult =getElement(By.xpath("//a[@href='/logout'] ")).getText();
        Assert.assertEquals("Log out",actuactualResult);
        System.out.println("Expected Result : Log out = Actual Result : " +actuactualResult);
    }
    public void NavigateNotebooks()
    {
        ActionCategory(By.xpath("//a[@href='/computers']"),By.xpath("//a[@href='/notebooks']"));
        //getElement(By.xpath("//a[@href='/computers']")).sendKeys().click();

    }

    public void SortNotebooks()
    {
        //getSelectedDropDownValue(By.id("products-orderby"));
        //getElement(By.xpath("//option[text='Created On'")).click();

       WebElement element =getElement(By.id("products-orderby"));
        //element.click();
       String strdropdownselected=getSelectedDropDownValue(element);
       System.out.println(strdropdownselected);
    }
}
