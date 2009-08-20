package bradshawlab1;

//David Bradshaw    7.3 Account Class
//import java.util.Arrays;
//import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.lang.String;
public class AccountClass {

    public static void main(String[] args) {
// TODO computer interest information.
    Account testAccount = new Account(1122, 20000.00, 4.5, "July 19, 2008", 3000.00, 2500.00);

    testAccount.balance = testAccount.deposit();
    testAccount.balance = testAccount.withdraw();

        System.out.println("Information for Account Number: " + testAccount.id);
        System.out.println("Account Opened on: " + testAccount.dateCreated);
        System.out.println("Monthly Interest Rate: " + testAccount.monthlyInterestRate() + "%");
        System.out.println("Available Balance: $" + testAccount.balance);
    }
}

class Account {

    int id;
    double balance;
    double annualInterestRate;
    String dateCreated;
    double amountDeposited;
    double amountWithdrawn;

    Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;

       }

    Account(int newId, double newBalance, double newAnnualInterestRate, String newDateCreated, double newAmountDeposited, double newAmountWithdrawn) {

        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;
        dateCreated = newDateCreated;
        amountDeposited = newAmountDeposited;
        amountWithdrawn = newAmountWithdrawn;

    }

    double withdraw() {
        return (balance - amountWithdrawn);
    }

    double deposit() {
        return (balance + amountDeposited);
    }

    double monthlyInterestRate() {

        return annualInterestRate/12;
    }
}