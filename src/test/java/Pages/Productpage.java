package Pages;
import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Productpage {
    public WebDriver driver= Hooks.driver;



    public WebElement product() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//a[@href=\"/products\"]"));
    }
   public WebElement ViewProduct() throws InterruptedException {
       Thread.sleep(2000);
       return driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]"));
   }
   public WebElement AddtocartButton() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//button[@type=\"button\"]"));
   }

   }
