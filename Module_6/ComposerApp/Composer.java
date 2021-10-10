/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class Composer {
    /* Data fields with default values */
    private int id = 0;
    private String name = "";
    private String genre = "";

    /* Default constructor */
    Composer() {

    }

    /* Constructor with three arguments */
    Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    /**
     * Accessor for id
     * @return int
     */

    public int getId() {
        return id;
    }

    /**
     * Accessor for name
     * @return String
     */

    public String getName() {
        return name;
    }

    /**
     * Accessor for genre
     * @return String
     */

    public String getGenre() {
        return genre;
    }

    /**
     * Overriding toString method to return description of composer object
     * @return String
     */

    @Override
    public String toString() {
        return String.format("\n    Composer #%d\n    Name: %s\n    Genre: %s", id, name, genre);
    }
}
