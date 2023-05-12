package lecture17.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OpenWindowPractice {
    WebDriver driver;
    String url = "https://www.letskodeit.com/practice";
    @Before
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void testOpenWindow() throws InterruptedException {
        String parentWindowHandle = driver.getWindowHandle();//declaring variable to get unique id for parentwindow(main window)
        System.out.println(parentWindowHandle);//just to see id of that window,don't need to do in real time
        driver.findElement(By.id("openwindow")).click();
        Set<String> allWindowHandles = driver.getWindowHandles();//declaring variable to get unique id for all windows( here we have only 2 windows)
        System.out.println(allWindowHandles);//to see all window unique ids
        for(String handle:allWindowHandles){
            if(!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(2000);
                WebElement searchTab = driver.findElement(By.xpath("//input[@id=\"search\"]"));
                searchTab.sendKeys("python");
                searchTab.sendKeys(Keys.ENTER);
                Thread.sleep(3000);
                driver.close();

            }
        }
        driver.switchTo().window(parentWindowHandle);
        WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
        Thread.sleep(2000);
        bmwRadio.click();

    }
    @After
    public void teardown(){
        driver.close();
    }
}
