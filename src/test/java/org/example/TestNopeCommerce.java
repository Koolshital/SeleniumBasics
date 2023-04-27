package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNopeCommerce {
    @Test
    public void testPractice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("shital@yahoo.com");
        driver.findElement(By.className("password")).sendKeys("123456");
        Thread.sleep(2000);
        //driver.findElement(By.className("button-1 ")).click();
        driver.findElement(By.className("login-button")).click();

    }
}
