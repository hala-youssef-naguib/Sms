package Steps;

import Pages.RegisterPage;
import Pages.loginpage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class registerSteps {

        Hooks hooks=new Hooks();

@BeforeTest
      public void before(){
hooks.openBrowser();
      }



@Test
    public void TestCAse1() throws InterruptedException {


        RegisterPage registerPage=new RegisterPage();
        //press on SignUp/Login
        registerPage.SignUp_Login_Button().click();
        //New User Signup! Enter Valid Name and Email
        registerPage.Name().sendKeys("akkkkkkkksddkkkkks");
        registerPage.Email().sendKeys("aaaaaaaadhhwwhhhhhh@gmail.com");
        //Click on SignUp button
        registerPage.SignUp_Button().click();
        //Enter all valid data
        registerPage.Gender().click();
        registerPage.Password().sendKeys("0281928189");
        registerPage.FirstName().sendKeys("aaaaaaaaaa");
        registerPage.last_name().sendKeys("aaaaaaaaaaaaaa");
        registerPage.address().sendKeys("sssssaaaaaaaa");

        Select select=new Select(registerPage.Country());
        select.selectByVisibleText("Canada");

        registerPage.state().sendKeys("czjbsbh");
        registerPage.city().sendKeys("afajbdsajd");
        registerPage.zipcode().sendKeys("ajsbdha");
        registerPage.mobile_number().sendKeys("sajdbsajsd23242");




        //Click on SignUp button
        registerPage.SignUp_Bu().click();
}


@Test
public void TestCase2() throws InterruptedException {
    RegisterPage registerPage=new RegisterPage();
    loginpage login=new loginpage();
    //press on SignUp/Login
    registerPage.SignUp_Login_Button().click();
login.Email().sendKeys("aaaaaaaadhhwwhhhhhh@gmail.com");
login.Password().sendKeys("0281928189");
login.LoginButton().click();
//hard assert
    Assert.assertEquals(login.Sucessmessage().getText(),"akkkkkkkksddkkkkks");
    //soft assert
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertEquals(login.Sucessmessage().getText(),"akkkkkkkksddkkkkks");
    softAssert.assertAll();
}



@AfterTest
    public void After() throws InterruptedException {
        Thread.sleep(5000);
        hooks.quit();
    }










}
