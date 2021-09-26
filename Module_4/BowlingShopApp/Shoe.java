/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class Shoe extends Product {
    private double size = 0; // shoe size with default of 0

    /** Default constructor */
    public Shoe() {
    }

    /**
     * Accessor method for size variable
     * @return double
     */

    public double getSize() {
        return size;
    }

    /**
     * Mutator method for size variable
     * @param size double
     */

    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Overriden toString() method
     * @return String description of shoe
     */

    @Override
    public String toString() {
        return String.format("%s\n    Shoe Size: %.1f\n", super.toString(), size);
    }
}
