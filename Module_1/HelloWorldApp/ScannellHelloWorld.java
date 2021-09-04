/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

class ScannellHelloWorld {

    /**
     * Method with two arguments, which are used to print the user's first and last name.
     * @param firstName String
     * @param lastName String
     * @return prints the string to the console window.
     */

    public static void helloWorld(String firstName, String lastName) {
        System.out.printf("Hello World from %s %s.%n", firstName, lastName);
    } // end helloWorld

    public static void main(String[] args) {
        helloWorld("Sarah", "Scannell"); // Call helloWorld method passing the values "Sarah" and "Scannell"
    } // end main
} // end ScannellHelloWorld