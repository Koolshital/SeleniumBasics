import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class PracticeOpenUrl {
    public static void main(String[] args)  {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

//        driver.get("https://www.next.co.uk/");
//        Thread.sleep(3000);
//        driver.close();
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.manage().window();
        driver1.get("https://www.next.co.uk/");




    }
}
