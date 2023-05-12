package lecture16.prctice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class RadioButtonPractice {
    WebDriver driver;
    String url = "https://www.letskodeit.com/practice";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void selectRadioButton() throws InterruptedException {
        driver.findElement(By.cssSelector("input#benzradio")).click();
        Thread.sleep(3000);
       // driver.findElement(By.cssSelector("input#bmwradio")).click();
       // Thread.sleep(2000);
        boolean ans = driver.findElement(By.cssSelector("input#hondaradio")).isSelected();
        assertEquals(false,ans);
        Thread.sleep(2000);
    }
    @After
    public void teardown(){
        driver.close();
    }

}
