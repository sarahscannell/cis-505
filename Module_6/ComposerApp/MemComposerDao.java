/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.util.*;

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers = new ArrayList<Composer>();

    /* Constructor */
    MemComposerDao() {
        composers.add(new Composer(1791, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1899, "Scott Joplin", "Ragtime"));
        composers.add(new Composer(1924, "George Gershwin", "Jazz"));
        composers.add(new Composer(1974, "Brian Eno", "Experimental"));
        composers.add(new Composer(1983, "John Carpenter", "Electronic"));
    }

    /**
     * Overridden findAll method
     * @return List<Composer>
     */

    @Override
    public List<Composer> findAll() {
        return composers;
    }

    /**
     * Overriden findBy method
     * @param id Integer
     * @return Composer
     */

    @Override
    public Composer findBy(Integer id) {
        Composer composer = new Composer();

        for (int i = 0; i < composers.size(); i++) {
            if(composers.get(i).getId() == id) {
                composer = composers.get(i);
                break;
            }
        }

        return composer;
    }

    /**
     * Overriden insert method
     * @param composer Composer
     */
    
    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    }
}
