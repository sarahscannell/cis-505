/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.util.Scanner;

public class TestBowlingShopApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create Scanner object for user input
        String code; // variable to store user input

        displayMenu();

        code = input.nextLine();

        while(!code.equalsIgnoreCase("x")) {
            
            GenericQueue<Product> products = ProductDB.getProducts(code);

            System.out.print("\n    --Available Products--\n");
            while(products.getSize() > 0) {
                Product product = products.dequeue();
                System.out.print(product.toString());
            }

            displayMenu();

            code = input.nextLine();
            
        }

        System.out.println("\n    Bye for now\n");
        
    }
  
    public static void displayMenu() {
        System.out.print("\n\n    MENU OPTIONS\n      1. <b> Bowling Balls\n      2. <a> Bowling Bags\n      3. <s> Bowling Shoes\n      4. <x> To exit\n\n    Please choose an option: ");
    }
}
