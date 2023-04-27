package org.example;//open url using junit

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open5UrlWithJunit {
    static WebDriver driver;//declared outside method so don't need to create multiple times
    @Before
    public void openWebBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();//just done as precondition which we require to open any url
        driver = new ChromeDriver();//intializing
        driver.manage().window().maximize();//this is optional , use as per requirement
    }

    @Test
    public void openNext() throws InterruptedException {
      //  WebDriverManager.chromedriver().setup();we don't need to write everytime as we have created seperate method and set up @Before
       // WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://www.next.co.uk");
       // Thread.sleep(3000); done as @After so don't need to write everytime
      //  driver.close();
    }

    @Test
    public void openShein() throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://www.shein.co.uk/");
        //Thread.sleep(3000);
        //driver.close();
    }

    @Test
    public void openAmazon() throws InterruptedException {
      //  WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://www.amazon.co.uk/gcx");
       // Thread.sleep(3000);
       // driver.close();
    }

    @Test
    public void openBbc() throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://www.bbc.co.uk/news");
        //Thread.sleep(3000);
       // driver.close();
    }

    @Test
    public void openEbay() throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        driver.get("https://www.ebay.co.uk/");
        //Thread.sleep(3000);
      //  driver.close();

    }
    @After
    public void closeBrowser() throws InterruptedException {
       Thread.sleep(2000);
        driver.close();



    }

    }


