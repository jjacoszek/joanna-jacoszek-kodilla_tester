package homework.bank;


import homework.CashMachine;

public class Bank {
    private int[] cashMachines;
    private int size;
    private final CashMachine cashMachine2;

    public Bank() {
        this.size = 0;
        this.cashMachines = new int[0];
        this.cashMachine2 = new CashMachine();
    }

    public int[] getCashMachines() {
        return cashMachines;
    }

    public int getSize() {
        return size;
    }

    public void addCashMachine(int cashMachine) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public int[] getCashMachine() {
        return cashMachines;
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        int i;
        for (i = 0; i < this.cashMachines.length; i++) {
            totalBalance += this.cashMachine2.getBalance();
        }
        return totalBalance;

    }


    public int getTotalPaycheck() {
        int i;
        int totalPaycheck = 0;
        for (i = 0; i < this.cashMachines.length; i++) {
            int[] transaction2 = this.cashMachine2.getTransactions();
            for (int j = 0; j < transaction2.length; i++) {
                if (transaction2[j] < 0) {
                    totalPaycheck += 1;
                }
            }

        }
        int totalPaycheck1 = totalPaycheck;
        return totalPaycheck1;

    }

    public int getTotalPayment() {
        int i;
        for (i = 0; i < this.cashMachines.length; i++) {
            int[] transaction2 = this.cashMachine2.getTransactions();
            for (int j = 0; j < transaction2.length; i++) {
                int totalPayment  = 0;
                if (transaction2[j] > 0) {
                    totalPayment += 1;
                }
                return totalPayment;
            }

        }
        return i;
    }

    public int getAvgPaycheck() {
        int totalSumPaycheck = 0;
        int transactionQty =0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            int[] transaction2 = this.cashMachine2.getTransactions();
            for (int j = 0; j < transaction2.length; i++) {
                if (transaction2[j] < 0) {
                    transactionQty += 1;
                    totalSumPaycheck += transaction2[j];
                }
            }
        }
        int avg = totalSumPaycheck/transactionQty;
        return avg;
    }


    public int getAvgPayment() {
        int totalSumPayment = 0;
        int transactionQty =0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            int[] transaction2 = this.cashMachine2.getTransactions();
            for (int j = 0; j < transaction2.length; i++) {
                if (transaction2[j] > 0) {
                    transactionQty += 1;
                    totalSumPayment += transaction2[j];
                }
            }

        }

    int avg1 = totalSumPayment/transactionQty;
            return avg1;
    }
}
