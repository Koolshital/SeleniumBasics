package lecture16.prctice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WebTablePractice {
    WebDriver driver;
    String url ="https://www.letskodeit.com/practice";
    String expectedHeading1 ="Author";
    String expectedHeading2 ="Course";
    String expectedHeading3 ="Price";
    String expectedCourseName = "Python Programming Language";
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void testWebTableHeading(){
        for(int i = 1;i<=3;i++){
            String actualHeading = driver.findElement(By.xpath("//table[@id=\"product\"]/tbody/tr/th["+i+"]")).getText();
            System.out.println(actualHeading);

    }}

  //  @Test
//    public void testWebTableData(){//get table details with for loop
//        for(int i =2;i<=4;i++) {
//            for (int j = 1; j <= 3; j++) {
//
//                String actualTableText = driver.findElement(By.xpath("//table[@id=\"product\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText();
//                System.out.println(actualTableText);
//
//            }
//        }
//    }
  @Test
  public  void  getTableTextColumn1(){
      List<WebElement> elementTexts = driver.findElements(By.xpath("//td[@class=\"author-name\"]"));
      for (WebElement elementText:elementTexts)
      {
          System.out.println(elementText.getText());

      }

  }
    @Test
    public  void  getTableTextColumn2(){
        List<WebElement> ElementTexts = driver.findElements(By.xpath("//td[@class=\"course-name\"]"));
        for (WebElement ElementText:ElementTexts)
              {
                  System.out.println(ElementText.getText());
        }

//        boolean ans = ElementTexts.contains(expectedCourseName);
//        assertTrue(ans);
    }
    @Test
    public void getTableTextColumn3(){
        List<WebElement> ElementTexts = driver.findElements(By.xpath("//td[@class=\"price\"]"));
        for (WebElement ElementText:ElementTexts) {
            System.out.println(ElementText.getText());

        }
    }
    @After
    public void teardown(){
       // driver.quit();
    }
}
