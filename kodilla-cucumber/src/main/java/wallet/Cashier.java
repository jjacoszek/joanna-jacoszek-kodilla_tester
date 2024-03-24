package wallet;

public class Cashier {
    private final Cashslot cashSlot;

    public Cashier(Cashslot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            wallet.deposit(-amount);
            cashSlot.dispense(amount);
        }
    }
    }

