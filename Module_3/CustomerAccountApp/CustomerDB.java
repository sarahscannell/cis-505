/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class CustomerDB {
    
    /**
     * Method to return a customer object
     * @param id int
     * @return
     */

    public static Customer getCustomer(int id) {
        if(id == 1007) {
            return new Customer("Sasha Lopez","12724 Langstaff Dr","Windermere","34786");
        } else if(id == 1008) {
            return new Customer("Laura Dennison","37 Sharon Rd","Windham","03087");
        } else if(id == 1009) {
            return new Customer("Ryan O\'Toole","88 Browning Ave","West Dundee","60118");
        } else {
            return new Customer();
        }
    }
}
