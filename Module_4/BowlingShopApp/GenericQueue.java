/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class GenericQueue<E> {
    private java.util.LinkedList<E> list 
      = new java.util.LinkedList<E>(); // generic link list data field
  
    /**
     * Enqueue method
     * @param item E (generic)
     */

    public void enqueue(E item) {
      list.addLast(item);
    }

    /**
     * Dequeue method
     * @return E (generic)
     */
  
    public E dequeue() {
      return list.removeFirst();
    }

    /**
     * Method to get list size
     * @return int
     */
  
    public int getSize() {
      return list.size();
    }
  }