/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class Ball extends Product {
    private String color = ""; // bowling ball color with default empty string

    /* Default constructor */
    public Ball() {
    }

    /**
     * Accessor method for color variable
     * @return String
     */

    public String getColor() {
        return color;
    }

    /**
     * Mutator method for color variable
     * @param color String
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Overriden toString() method
     * @return String description of bowling ball
     */

     @Override
     public String toString() {
         return String.format("%s\n    Ball Color: %s\n", super.toString(), color);
     }


}
