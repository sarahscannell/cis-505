import java.util.Scanner;

/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class TestCustomerAccountApp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object for user input
        char cont = 'y'; // determines whether to continue while loop
        Account account = new Account();

        System.out.print("\n  Enter a customer ID (1007, 1008, 1009) > ");
        int id = Integer.parseInt(input.nextLine());
        Customer customer = CustomerDB.getCustomer(id);

        while(cont == 'y') {
            account.displayMenu();
            char option = input.nextLine().charAt(0);
            if(option == 'D' || option == 'd') {
                System.out.print("      Enter deposit amount > ");
                double amt = Double.parseDouble(input.nextLine());
                account.deposit(amt);
            } else if(option == 'W' || option == 'w') {
                System.out.print("      Enter withdrawal amount > ");
                double amt = Double.parseDouble(input.nextLine());
                account.withdraw(amt);
            } else if(option == 'B' || option == 'b') {
                System.out.printf("      Current balance is $%6.2f.", account.getBalance());
            } else {
                System.out.print("\n  ** Error: Invalid Option ** \n");
            }

            System.out.print("\n    Continue? (y/n) > ");

            cont = input.nextLine().charAt(0);
        }

        System.out.printf("\n%s\n\n    Balance as of %s is $%6.2f.\n", customer.toString(), account.getTransactionDate(), account.getBalance());
    }
}
