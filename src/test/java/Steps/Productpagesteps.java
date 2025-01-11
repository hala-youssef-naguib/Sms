package Steps;

import Pages.Productpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Productpagesteps {
   Productpage productpage = new Productpage();
    @Given("Home page appear and user click on product page")
    public void Product() throws InterruptedException {
        productpage.product().click();
    }

    @When("user click on view product")
    public void ViewProduct() throws InterruptedException {
        productpage.ViewProduct().click();
        }
    @Then("user click on add to cart")
       public void AddtocartButton() throws InterruptedException {
        productpage.AddtocartButton().click();
    }
}
