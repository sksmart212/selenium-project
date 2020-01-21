package nopCommerce.CommerceWebPages;

import Tests.utils.Utils;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Register extends Utils
{
    private static String PAGE_URL = "https://demo.nopcommerce.com";
    protected static WebDriver driver;
    public void Registration()
{

    navigateToUrl(PAGE_URL);
    //driver.get(PAGE_URL);

    //
   // driver.findElement(By.xpath("//a[@class= \'ico-register\']")).click();
    getElement(By.xpath("//a[@class= \'ico-register\']")).click();
    SendKeys(By.id("FirstName"),"James4");
    SendKeys(By.id("LastName"),"bond4");
    SendKeys(By.id("Email"),"abcefg4@yahoo.com");
    SendKeys(By.id("Password"),"London908911");
    SendKeys(By.id("ConfirmPassword"),"London908911");
    getElement(By.id("register-button")).click();

    //driver.findElement(By.id("FirstName")).sendKeys("james1");
    //driver.findElement(By.id("LastName")).sendKeys("bond1");
    //driver.findElement(By.id("Email")).sendKeys("qwe" + "@yahoo.com");
    //driver.findElement(By.id("Password")).sendKeys("Jan2001");
    //driver.findElement(By.id("ConfirmPassword")).sendKeys("Jan2001");
    //driver.findElement(By.id("register-button")).click();
    String actualRegistrationSuccessMessage = getElement(By.xpath("//div[@class=\'result\']")).getText();
    Assert.assertEquals("Your registration completed", actualRegistrationSuccessMessage);


}

}
