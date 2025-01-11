package Steps;

import Pages.Cartpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cartpagesteps {
    Cartpage cartpage=new Cartpage();
    @Given("user click on cart")
    public void CartButton() throws InterruptedException {
        //press on cart
        cartpage.CartButton().click();
    }
    @When("user click on proceed to chekout")
    public void ProceedToCheckout() throws InterruptedException {
        //press on proceed to checkout
        cartpage.ProceedToCheckout().click();
    }
    @Then("user click on place order")
    public void PLaceorder() throws InterruptedException {
        //press on proceed to checkout
        cartpage.Placeorder().click();
    }
    @Then("user enter payment data1")
    public void NameOnCard() throws InterruptedException {
        //fill payment data
        cartpage.NameOnCard().sendKeys("fvxvx");
    }
    @And("user enter payment data2")
    public void CardNumber() throws InterruptedException {
        //fill payment data
        cartpage.CardNumber().sendKeys("12234");
    }
    @And("user enter payment data3")
    public void CVC() throws InterruptedException {
        //fill payment data
        cartpage.CVC().sendKeys("111");
    }
    @And("user enter payment data4")
    public void ExpirationMonth() throws InterruptedException {
        //fill payment data
        cartpage.ExpirationMonth().sendKeys("1");
    }
    @And("user enter payment data5")
    public void ExpirationYear() throws InterruptedException {
        //fill payment data
        cartpage.ExpirationYear().sendKeys("2026");
    }
    @And("user enter payment data6")
    public void PayAndConfirmOrder() throws InterruptedException {
        //fill payment data
        cartpage.PayAndConfirmOrder().click();
    }
}
