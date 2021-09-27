/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.text.SimpleDateFormat;

public class Transaction {

    private String date = new SimpleDateFormat("MM-dd-yyyy").format(new java.util.Date()); // default is today's date in MM-dd-yyy format
    private String description = ""; // String description defaulted to empty string
    private double amount = 0; // transaction amount defaulted to 0

    /* Default constructor */
    Transaction() {
    }

    /* Constructor with two arguments - needed for TestExpenseTracker according to sample code */
    Transaction(String description, double amount) {
        this(new SimpleDateFormat("MM-dd-yyyy").format(new java.util.Date()), description, amount);
    }

    /* Constructor with three arguments */
    Transaction(String date, String description, double amount) {
        setDate(date);
        setDescription(description);
        setAmount(amount);
    }

    /**
     * Accessor for date
     * @return String
     */

    public String getDate() {
        return date;
    }

    /**
     * Accessor for description
     * @return String
     */

    public String getDescription() {
        return description;
    }

    /**
     * Accessor for amount
     * @return double
     */

    public double getAmount() {
        return amount;
    }

    /**
     * Mutator for date
     * @param date String
     */

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Mutator for description
     * @param description String
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Mutator for amount
     * @param amount double
     */

    public void setAmount (double amount) {
        this.amount = amount;
    }

    /**
     * Overriding toString() method to return description of transaction object
     * @return String
     */
    
    @Override
    public String toString() {
        return String.format("\n    Date: %s\n    Description: %s\n    Amount: $%,6.2f", date,description,amount);
    }
}
