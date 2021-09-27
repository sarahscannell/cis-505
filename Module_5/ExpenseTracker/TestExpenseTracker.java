/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.io.IOException;
import java.util.*;

public class TestExpenseTracker {

    /**
     * Main method to test ExpenseTracker files
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont = "y";

        System.out.print("\n\n    Welcome to the Expense Tracker\n");

        while(cont.equalsIgnoreCase("y")) {
            int input = ValidatorIO.getInt(sc, menu());

            if(input == 1) { // Displays transactions from file
                ArrayList<Transaction> list = null;

                try {
                    list = TransactionIO.findAll();
                } catch(IOException e) {
                    System.out.println("\n    Exception: " + e.getMessage());
                }

                System.out.print("\n    MONTHLY EXPENSES");

                for(Transaction tran : list) {
                    System.out.printf("\n\n    Date: %s\n    Description: %s\n    Amount: $%,6.2f", tran.getDate(), tran.getDescription(), tran.getAmount());
                }
            } else if(input == 2) { // Allows user to enter transactions
                String cont2 = "y";
                ArrayList<Transaction> transactions = new ArrayList<Transaction>();

                while(cont2.equalsIgnoreCase("y")) {
                    String description = ValidatorIO.getString(sc, "\n    Enter the description: ");
                    double amount = ValidatorIO.getDouble(sc, "    Enter the amount: $");

                    Transaction tran = new Transaction(description, amount);

                    transactions.add(tran);

                    cont2 = ValidatorIO.getString(sc, "\n    Add another transaction? [y/n]: ");

                    while(!cont2.equalsIgnoreCase("y") && !cont2.equalsIgnoreCase("n")) {
                        System.out.print("\n    Invalid entry!");
                        cont2 = ValidatorIO.getString(sc, "\n    Add another transaction? [y/n]: ");
                    }
                }

                try {
                    TransactionIO.bulkInsert(transactions);
                } catch(IOException e) {
                    System.out.println("\n    Exception: " + e.getMessage());
                }
            } else if(input == 3) { // Shows running total of all expenses in file
                ArrayList<Transaction> list = null;
                double totalAmt = 0;

                try {
                    list = TransactionIO.findAll();
                } catch(IOException e) {
                    System.out.println("\n    Exception: " + e.getMessage());
                }

                for(Transaction tran : list) {
                    totalAmt += tran.getAmount();
                }

                System.out.printf("\n    Your total monthly expense is $%,6.2f.", totalAmt);
            }

            cont = ValidatorIO.getString(sc, "\n\n    Continue? [y/n]: ");

            while(!cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("n")) {
                System.out.print("\n    Invalid entry!");
                cont = ValidatorIO.getString(sc, "\n    Continue? [y/n]: ");
            }
        }
        
        System.out.println("\n    Bye!");
        
    }

    /**
     * Method to return menu string
     * @return String
     */

    public static String menu() {
        return "\n    MENU OPTIONS\n      1. View Transactions\n      2. Add Transactions\n      3. View Expense\n\n    Please choose an option: ";
    }
}
