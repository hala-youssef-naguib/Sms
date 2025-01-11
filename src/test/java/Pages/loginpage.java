package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
    public WebDriver driver= Hooks.driver;



  public WebElement Email() throws InterruptedException {
       Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    }
    public WebElement Password() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    }
   public WebElement LoginButton() throws InterruptedException {
        Thread.sleep(2000);
       return driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
    }
    public WebElement Sucessmessage() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//*[text()='akkkkkkkksddkkkkks']"));
    }

















}
