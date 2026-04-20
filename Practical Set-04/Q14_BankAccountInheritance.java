class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Saving Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount() {
        double amount = balance * 1.10; // example 10% return
        System.out.println("Maturity Amount: " + amount);
    }
}

public class TestBank {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.openAccount(1, "Disha", 10000);
        s.deposit(2000);
        s.checkBalance();
        s.calculateInterest();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(2, "Rahul", 20000);
        f.maturityAmount();
    }
}
