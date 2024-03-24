package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps3 {

    Wallet wallet = new Wallet();
    int balanceSeen;

    @Given("there is ${int} in my wallet2")
    public void there_is_$_in_my_wallet2(int initialBalance) {
        wallet.deposit(initialBalance);
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        balanceSeen = wallet.getBalance();
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$(int expectedBalance) {
        Assertions.assertEquals(expectedBalance, balanceSeen);
    }

}
