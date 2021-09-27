/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.util.Scanner;

public class ValidatorIO {

    /**
     * Method to validate user input as int
     * @param sc Scanner
     * @param prompt String
     * @return int
     */

    public static int getInt(Scanner sc, String prompt) {
        int input = 0;

        boolean isValid = false;

        while(!isValid) {
            System.out.print(prompt);

            if(sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n    Error! Invalid integer value.\n");
            }

            sc.nextLine();
        }
        return input;
    }

    /**
     * Method to validate user input as double
     * @param sc Scanner
     * @param prompt String
     * @return double
     */

    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;

        boolean isValid = false;

        while(!isValid) {
            System.out.print(prompt);

            if(sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("\n    Error! Invalid integer value.\n");
            }

            sc.nextLine();
        }
        return input;
    }

    /**
     * Method to validate user input as String
     * @param sc Scanner
     * @param prompt String
     * @return String
     */

    public static String getString(Scanner sc, String prompt) {
        String input = "";

        boolean isValid = false;

        while(!isValid) {
            System.out.print(prompt);

            if(sc.hasNext()) {
                input = sc.next();
                isValid = true;
            } else {
                System.out.println("\n    Error! Invalid integer value.\n");
            }

            sc.nextLine();
        }
        return input;
    }
}
