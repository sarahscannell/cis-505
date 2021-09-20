/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.text.SimpleDateFormat;

public class Account {
    private double balance = 200; //initial account balance is 200

    /**
     * Method to return balance amount
     * @return double
     */

    double getBalance() {
        return balance;
    }

    /**
     * Method to increase balance of account
     * @param amt double
     */

    public void deposit(double amt) {
        balance = balance + amt;
    }

    /**
     * Method to decrease balance of account
     * @param amt double
     */

    public void withdraw(double amt) {
        if(balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.printf("\n    Current balance is $%6,2f. You may not withdraw more than the balance.", balance);
        }
    }

    /**
     * Method to display menu
     */

    public void displayMenu() {
        System.out.print("\n    // Account Menu //\n    Enter <D/d> for deposit\n    Enter <W/w> for withdraw\n    Enter <B/b> for balance\n      Enter choice > ");
    }

    /**
     * Method to return date in MM-dd-yyyy format
     * @return String
     */

    public String getTransactionDate() {
        SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");

        return f.format(new java.util.Date());
    }
}
