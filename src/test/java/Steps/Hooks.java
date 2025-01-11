package Steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void openBrowser() {
        String browserName = "edge";
        if (browserName.contains("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.contains("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.contains("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();  // Default to Chrome
        }

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationexercise.com/");
    }

  @After
    public void quit() throws InterruptedException {
        if (driver != null) {
           driver.quit();
        }
    }

}
