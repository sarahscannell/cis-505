/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class Product {
    private String code = ""; // product code with a default empty string
    private String description = ""; // product description with a default empty string
    private double price = 0; // product price with a default of $0.00

    /* Default constructor */

    public Product() {
    }

    /**
     * Accessor method for code variable
     * @return String
     */

    public String getCode() {
        return code;
    }

    /**
     * Accessor method for description variable
     * @return String
     */

    public String getDescription() {
        return description;
    }

    /**
     * Accessor method for price variable
     * @return double
     */

    public double getPrice() {
        return price;
    }

    /**
     * Mutator method for code variable
     * @param code String
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Mutator method for description variable
     * @param description String
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Mutator method for price variable
     * @param price double
     */

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Overridden toString() method
     * @return String description of object
     */

    @Override
    public String toString() {
        return String.format("\n    Code: %s\n    Description: %s\n    Price: $%,6.2f", code,description,price);
    }
}
