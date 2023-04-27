package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXPath {
    @Test
    public void practiceXpath() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Shital");
        driver.findElement(By.id("LastName")).sendKeys("Dalal");
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")).sendKeys("16");
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")).sendKeys("march");
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("shital@yahoo.com");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();
        Thread.sleep(5000);
        driver.close();




}

    }

