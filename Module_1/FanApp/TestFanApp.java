/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class TestFanApp {

    /* Main method tests Fan class */

    public static void main(String[] args) {
        Fan defaultFan = new Fan(); // creates fan with default values
        Fan customFan = new Fan(Fan.FAST, true, 12, "purple"); // creates fan with passed values

        System.out.println(defaultFan.toString() + "\n" + customFan.toString()); // prints strings describing fans
        
    }
}
