class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0; // same for all

    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    void calculateInterest() {
        double interest = (balance * interest_rate) / 100;
        System.out.println("Interest: " + interest);
    }

    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        calculateInterest();
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Disha", 10000);
        BankAccount acc2 = new BankAccount("Rahul", 20000);

        acc1.display();
        acc2.display();

        BankAccount.updateInterestRate(6.5);

        System.out.println("\nAfter updating interest rate:");
        acc1.display();
        acc2.display();
    }
}
