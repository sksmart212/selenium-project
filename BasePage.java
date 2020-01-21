package nopCommerce.CommerceWebPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage
{

    public WebDriver driver;
    public WebDriverWait wait;
    public BasePage (WebDriver driver){

       // this.driver = driver;
        //registerDriver();
        //wait = new WebDriverWait(driver,15);
    }
    public void registerDriver()
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
}
