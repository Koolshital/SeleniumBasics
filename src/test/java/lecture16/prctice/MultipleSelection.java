package lecture16.prctice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;

public class MultipleSelection {
    WebDriver driver;
    String url ="https://www.letskodeit.com/practice";
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(url);

    }
    @Test
    public void testMultipleSelection() throws InterruptedException {
        WebElement selectElement = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Apple");
        select.selectByValue("orange");
        Thread.sleep(3000);
        boolean ans = driver.findElement(By.xpath("//option[@value=\"peach\"]")).isSelected();
        assertFalse(ans);

    }
    @After
    public void teardown(){
        driver.quit();
    }
}
