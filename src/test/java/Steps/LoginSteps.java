package Steps;

import Pages.RegisterPage;
import Pages.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class LoginSteps {
    loginpage login = new loginpage();
    @Given("home page appear user click on Signup login")
    public void SignUp_Login_Button() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage();
        //press on SignUp/Login
        registerPage.SignUp_Login_Button().click();
    }

@When("user enter Email address and password")
   public void Data() throws InterruptedException {
       login.Email().sendKeys("aaaaaaaadhhwwhhhhhh@gmail.com");
       login.Password().sendKeys("0281928189");
   }

@And("user click on login button")
   public void loginbutton() throws InterruptedException {
       login.LoginButton().click();
   }

@Then("user name appear and user can login sucess")
   public void SuccessLogin() throws InterruptedException {
       SoftAssert softAssert=new SoftAssert();
       softAssert.assertEquals(login.Sucessmessage().getText(),"akkkkkkkksddkkkkks");
       softAssert.assertAll();
   }

@When("user enter {string} address and {string}")
    public void InvalidData(String email,String pass) throws InterruptedException {
        login.Email().sendKeys(email);
        login.Password().sendKeys(pass);
    }
}
