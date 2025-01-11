package com.assignment.my_assignment;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Hello World!");
        
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        
        //open fb url
        driver.get("https://www.facebook.com/");
        
        //Locate the email text box and enter email
        WebElement emailInput = driver.findElement(By.id("email")); 
        emailInput.sendKeys("facebookemail@yahoo.com");
        
        //Locate the password text box and enter the password 
        WebElement passwordInput = driver.findElement(By.id("pass")); 
        passwordInput.sendKeys("Fbpassword"); 
        
        // Find the login button and click it 
        WebElement loginButton = driver.findElement(By.name("login")); 
        loginButton.click();
        
        Thread.sleep(4000);
        		
        System.out.println("Executed login script");
        driver.quit();

    }
}
