package lecture17.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertBoxPractice {
    WebDriver driver;
    String url ="https://www.letskodeit.com/practice";
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

    }
    @Test
    public void testAlertBox() throws InterruptedException {
        driver.findElement(By.name("enter-name")).sendKeys("Shital Dalal");//enter any name
        driver.findElement(By.id("alertbtn")).click();//click on alert button
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//accept the given details or name etc
        Thread.sleep(2000);

    }
    @Test
    public void testConfirmButton() throws InterruptedException {
        driver.findElement(By.name("enter-name")).sendKeys("Shital Dalal");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();//to select cancel in alertbox after clicking confirm button
        Thread.sleep(2000);
    }
    @After
    public  void  teardown(){
        driver.quit();
    }
}
