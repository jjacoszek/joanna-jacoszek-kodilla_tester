package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps2 {

    Wallet wallet = new Wallet();
    Cashslot cashSlot = new Cashslot();
    Cashier cashier = new Cashier(cashSlot);


    @Given("there is $100 in my wallet")
    public void there_is_100_in_my_wallet() {
        wallet.deposit(100);
    }

    @When("I withdraw $200")
    public void i_withdraw_$200() {
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        Assertions.assertEquals(100, wallet.getBalance());

    }
}
