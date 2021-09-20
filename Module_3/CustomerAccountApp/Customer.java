/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class Customer {
    /* Fields for the customer info*/
    private String name;
    private String address;
    private String city;
    private String zip;

    /* Default constructor creates a customer with
    empty strings by calling the argument constructor */
    Customer() {
        this("","","","");
    }
    
    /**
     * Constructor with arguments
     * @param name String
     * @param address String
     * @param city String
     * @param zip String
     */
    Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    /**
     * Accessor method for name variable
     * @return String
     */

    String getName() {
        return name;
    }

    /**
     * Accessor method for address variable
     * @return String
     */

    String getAddress() {
        return address;
    }

    /**
     * Accessor method for city variable
     * @return String
     */

    String getCity() {
        return city;
    }

    /**
     * Accessor method for zip variable
     * @return String
     */

    String getZip() {
        return zip;
    }

    /**
     * Method overriding toString()
     * @return String
     */
    public String toString() {
        return String.format("    // Customer Details //\n    Name: " + name + "\n    Address: " + address + "\n    City: " + city + "\n    Zip: " + zip);
    }
}
