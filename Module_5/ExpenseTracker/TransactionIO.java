/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.io.*;
import java.util.*;

public class TransactionIO {
    private final static String FILE_NAME = "expenses.txt"; // file name constant
    private static File file = new File(FILE_NAME); // file object
    
    /**
     * Method to insert transactions into file
     * @param transactions ArrayList<Transaction>
     * @throws IOException
     */

    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        for(Transaction tran : transactions) {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }

        output.close();
    }

    /**
     * Method to retrieve transactions from file
     * @return ArrayList<Transaction>
     * @throws IOException
     */

    public static ArrayList<Transaction> findAll() throws IOException {
        Scanner input = new Scanner(file);
        ArrayList<Transaction> list = new ArrayList<Transaction>();

        while(input.hasNext()) {
            String date = input.next();
            String description = input.next();
            double amount = input.nextDouble();
            Transaction tran = new Transaction(date, description, amount);
            list.add(tran);
        }

        input.close();
        return list;
    }
}
