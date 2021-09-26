/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class ProductDB {

    /**
     * Method creates a GenericQueue of products based on parameter
     * @param code String
     * @return GenericQueue<Product>
     */
    
    public static GenericQueue<Product> getProducts(String code) {
        if (code.equalsIgnoreCase("b")) {
            GenericQueue<Product> balls = new GenericQueue<Product>();

            Ball ball1 = new Ball();
            ball1.setCode("B100");
            ball1.setDescription("Black Widow");
            ball1.setPrice(249.99);
            ball1.setColor("Black");
            balls.enqueue(ball1);

            Ball ball2 = new Ball();
            ball2.setCode("B101");
            ball2.setDescription("Storm Ice");
            ball2.setPrice(99.99);
            ball2.setColor("Blue");
            balls.enqueue(ball2);
            

            Ball ball3 = new Ball();
            ball3.setCode("B102");
            ball3.setDescription("Brunswick TZone");
            ball3.setPrice(79.99);
            ball3.setColor("Teal");
            balls.enqueue(ball3);

            Ball ball4 = new Ball();
            ball4.setCode("B103");
            ball4.setDescription("Obsession Tour");
            ball4.setPrice(289.95);
            ball4.setCode("Orange");
            balls.enqueue(ball4);

            Ball ball5 = new Ball();
            ball5.setCode("B104");
            ball5.setDescription("Honey Badger");
            ball5.setPrice(157.95);
            ball5.setColor("Yellow");
            balls.enqueue(ball5);

            return balls;
        } else if(code.equalsIgnoreCase("a")) {
            GenericQueue<Product> bags = new GenericQueue<Product>();

            Bag bag1 = new Bag();
            bag1.setCode("A100");
            bag1.setDescription("KR Strikeforce Fast");
            bag1.setPrice(99.99);
            bag1.setType("Double");
            bags.enqueue(bag1);

            Bag bag2 = new Bag();
            bag2.setCode("A101");
            bag2.setDescription("Classic Tote");
            bag2.setPrice(29.99);
            bag2.setType("Single");
            bags.enqueue(bag2);

            Bag bag3 = new Bag();
            bag3.setCode("A102");
            bag3.setDescription("Storm 2 Deluxe");
            bag3.setPrice(49.99);
            bag3.setType("Double");
            bags.enqueue(bag3);

            Bag bag4 = new Bag();
            bag4.setCode("A103");
            bag4.setDescription("Ebonite Transport II");
            bag4.setPrice(119.99);
            bag4.setType("Double");
            bags.enqueue(bag4);

            Bag bag5 = new Bag();
            bag5.setCode("A104");
            bag5.setDescription("Brunswick Groove");
            bag5.setPrice(69.99);
            bag5.setType("Single");
            bags.enqueue(bag5);

            return bags;
        } else if(code.equalsIgnoreCase("s")) {
            GenericQueue<Product> shoes = new GenericQueue<Product>();

            Shoe shoe1 = new Shoe();
            shoe1.setCode("S100");
            shoe1.setDescription("Linds Monarch");
            shoe1.setPrice(59.95);
            shoe1.setSize(9.5);
            shoes.enqueue(shoe1);

            Shoe shoe2 = new Shoe();
            shoe2.setCode("S101");
            shoe2.setDescription("Brunswick Nirvana");
            shoe2.setPrice(57.95);
            shoe2.setSize(11);
            shoes.enqueue(shoe2);

            Shoe shoe3 = new Shoe();
            shoe3.setCode("S102");
            shoe3.setDescription("Tour Ultra");
            shoe3.setPrice(249.99);
            shoe3.setSize(8);
            shoes.enqueue(shoe3);

            return shoes;
        } else {
            return new GenericQueue<Product>();
        }
    }
}
