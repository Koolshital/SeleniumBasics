package lecture16.prctice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckboxPractice1 {
    WebDriver driver;
    String url ="https://www.letskodeit.com/practice";

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);


    }
    @Test
    public void chooseOneCheckbox(){
        driver.findElement(By.id("bmwcheck")).click();
        boolean ans = driver.findElement(By.id("benzcheck")).isSelected();
        assertFalse(ans);
        boolean ans1 = driver.findElement(By.id("hondacheck")).isSelected();
        assertFalse(ans1);
    }
    @Test
   public void chooseTwoCheckbox(){
        driver.findElement(By.id("bmwcheck")).click();
        driver.findElement(By.id("benzcheck")).click();
        boolean ans = driver.findElement(By.id("hondacheck")).isSelected();
        assertFalse(ans);

    }
    @Test
    public void chooseAllCheckbox(){
        driver.findElement(By.id("bmwcheck")).click();
        driver.findElement(By.id("benzcheck")).click();
        driver.findElement(By.id("hondacheck")).click();


    }


    @After
    public void teardown(){
        driver.quit();
    }}
