package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cartpage {
    public WebDriver driver= Hooks.driver;
    public WebElement CartButton() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//p//a[@href=\"/view_cart\"]"));

    }
        public WebElement ProceedToCheckout() throws InterruptedException {
            Thread.sleep(2000);
            return driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]"));
        }
    public WebElement Placeorder() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"/payment\"]"));
    }
    public WebElement NameOnCard() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@class=\"form-control\"]"));
    }
    public WebElement CardNumber() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@name=\"card_number\"]"));
    }
    public WebElement CVC() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@name=\"cvc\"]"));
    }
    public WebElement ExpirationMonth() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@class=\"form-control card-expiry-month\"]"));
    }
    public WebElement ExpirationYear() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//input[@name=\"expiry_year\"]"));
    }
    public WebElement PayAndConfirmOrder() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@class=\"form-control btn btn-primary submit-button\"]"));
    }
}
