package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {

    Wallet wallet = new Wallet();
    Cashslot cashSlot = new Cashslot();
    Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_$amount_in_my_wallet(int amount) {
        wallet.deposit(amount);
        Assertions.assertEquals(amount, wallet.getBalance());
    }

    @When("I request ${int}")
    public void i_request_$amount(int amount) {
        cashier.withdraw(wallet, amount);
    }

    @Then("${int} should be dispensed")
    public void $amount_should_be_dispensed(int amount) {
        Assertions.assertEquals(amount, cashSlot.getContents());
    }

}
