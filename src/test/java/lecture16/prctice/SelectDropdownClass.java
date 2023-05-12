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

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SelectDropdownClass {
    WebDriver driver;
    String url ="https://www.letskodeit.com/practice";
    String expectedtext ="Honda";

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void practiceDropDown() throws InterruptedException {
        WebElement brandElement = driver.findElement(By.cssSelector("select#carselect"));
        Select select = new Select(brandElement);
        select.selectByValue("honda");
        Thread.sleep(3000);
        String actualText = select.getFirstSelectedOption().getText();
        assertEquals("Select class is not working",expectedtext,actualText);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options){
            System.out.println(option.getText());
        }


    }
    @After
    public void teardown(){
        driver.quit();

    }
}
