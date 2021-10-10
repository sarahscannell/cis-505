/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

import java.util.*;

public interface GenericDao<E, K> {
    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
}
