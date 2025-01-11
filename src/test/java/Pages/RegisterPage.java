package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    public WebDriver driver=Hooks.driver;

    //press on SignUp/Login

    public WebElement SignUp_Login_Button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }


    //New User Signup! Enter Valid Name and Email

    public WebElement Name() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
    }

    public WebElement Email() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
    }

    //Click on SignUp button

    public WebElement SignUp_Button() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]"));
    }





    public WebElement Gender() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//label[@for=\"id_gender1\"]"));
    }
    public WebElement name() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"name\"]"));
    }
    public WebElement Password() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"password\"]"));
    }
    public WebElement FirstName() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]"));
    }
    public WebElement last_name() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]"));
    }
    public WebElement address() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"address\"]"));
    }
    public WebElement Country() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//select[@data-qa=\"country\"]"));
    }
    public WebElement state() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"state\"]"));
    }
    public WebElement city() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"city\"]"));
    }
    public WebElement zipcode() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"zipcode\"]"));
    }
    public WebElement mobile_number() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@data-qa=\"mobile_number\"]"));
    }
    public WebElement SignUp_Bu() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]"));
    }









}
