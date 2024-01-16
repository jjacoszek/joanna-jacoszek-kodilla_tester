package homework.bank;

public class CashMachine {

    private int[] transactions;
    private int size;



//Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }



    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public void withdraw(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = -transaction;
        this.transactions = newTab;
    }

    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int balance = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }
    public int getNumberOfTransactions() {
        return size;
    }

    public int[] getTransactions() {
        return transactions;
    }
}

