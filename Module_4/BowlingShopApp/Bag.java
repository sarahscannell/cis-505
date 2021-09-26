/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class Bag extends Product {
    private String type = ""; // type of bag (# of bowling balls) with default empty string

    /** Default constructor */
    public Bag() {
    }

    /**
     * Accessor method for type variable
     * @return String
     */

    public String getType() {
        return type;
    }

    /**
     * Mutator method for type variable
     * @param type String
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Overriden toString() method
     * @return String description of bag
     */

    @Override
    public String toString() {
        return String.format("%s\n    Bag Type: %s\n", super.toString(), type);
    }
}
