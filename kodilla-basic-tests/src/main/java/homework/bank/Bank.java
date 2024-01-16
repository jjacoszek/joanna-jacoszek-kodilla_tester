package homework.bank;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }

    public int getSize() {
        return size;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        int i;
        for (i = 0; i < this.cashMachines.length; i++) {
            totalBalance += this.cashMachines[i].getBalance();
        }
        return totalBalance;

    }


    public int getTotalPaycheck() {
        int totalPaycheck = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            int[] transactions = this.cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; i++) {
                if (transactions[j] < 0) {
                    totalPaycheck++;
                }
            }
        }
        return totalPaycheck;
    }

    public int getTotalPayment() {
        int totalPayment = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            int[] transactions = this.cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; i++) {
                if (transactions[j] > 0) {
                    totalPayment++;
                }
            }
        }
        return totalPayment;
    }

    public int getAvgPaycheck() {
        int totalSumPaycheck = 0;
        int transactionQty = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            int[] transactions = this.cashMachines[i].getTransactions();
            for (int j = 0; j < transactions.length; i++) {
                if (transactions[j] < 0) {
                    transactionQty += 1;
                    totalSumPaycheck += transactions[j];
                }
            }
        }
        // Dodaj sprawdzenie, czy transactionQty nie jest równe 0, aby uniknąć dzielenia przez zero
        int avg = (transactionQty != 0) ? totalSumPaycheck / transactionQty : 0;
        return avg;
    }

}