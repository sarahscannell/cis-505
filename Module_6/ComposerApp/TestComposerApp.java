/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.util.*;

public class TestComposerApp {

    /* Main method to test Composer App */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemComposerDao composers = new MemComposerDao();
        int input = 0;

        System.out.println("\n    Welcome to the Composer App");

        while(input != 4) {
            displayMenu();
            input = Integer.parseInt(sc.nextLine());

            if(input == 1) {
                List<Composer> composerList = composers.findAll();

                System.out.println("\n    // ALL COMPOSERS //");

                for(int i = 0; i < composerList.size(); i++) {
                    System.out.println(composerList.get(i).toString());
                }
            } else if(input == 2) {
                System.out.print("\n    //FIND A COMPOSER //\n\n      Enter an ID > ");
                int id = Integer.parseInt(sc.nextLine());
                Composer composer = composers.findBy(id);
                if(composer.getId() == id) {
                    System.out.println(composer.toString());
                } else {
                    System.out.println("\n    - Composer not found! Try again. -");
                }
                
            } else if(input == 3) {
                System.out.print("\n\n    // CREATE NEW COMPOSER //\n\n      Enter composer ID > ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("      Enter composer name > ");
                String name = sc.nextLine();
                System.out.print("      Enter composer genre > ");
                String genre = sc.nextLine();

                composers.insert(new Composer(id, name, genre));
            } else if(input != 4) {
                System.out.println("    Invalid entry! Please try again.");
            }
        }

        System.out.println("\n    Bye for now!\n");
    }

    /**
     * Method to display menu
     */
    public static void displayMenu() {
        System.out.print("\n    // MENU OPTIONS //\n      1. View Composers\n      2. Find Composers\n      3. Add Composer\n      4. Exit\n\n    Please choose an option > ");
    }
}
