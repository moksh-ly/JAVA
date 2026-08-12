
class BankAccount {
    final int accountNumber;
    String name;
    double balance;

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(101, "Moksh", 50000);

        account.display();

        // account.accountNumber = 102;  // Error
    }
}