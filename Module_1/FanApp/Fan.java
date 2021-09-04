/* 

Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.

Scannell, S. (2021) CIS 505 Intermediate Java Programming. Bellevue University.

*/

public class Fan {
    
    final static int STOPPED = 0, SLOW = 1, MEDIUM = 2, FAST = 3; // Fan speed constants
    private int speed = STOPPED; // Default speed of fan is stopped (0)
    private boolean on = false; // Fan defaults to off
    private double radius = 6; // Default radius of fan is 6
    private String color = "white"; // Default color of the fan is white

    /* Construct a default fan with default values */
    Fan() {
    }

    /**
     * Construct a custom fan with passed values
     * @param speed int
     * @param on boolean
     * @param radius double
     * @param color String
     */

    Fan(int speed, boolean on, double radius, String color) {
        setSpeed(speed);
        setOn(on);
        setRadius(radius);
        setColor(color);
    }

    public String toString() {
        if(on) {
            return String.format("The fan speed is set to " + speed + " with a color of " + color + " and a radius of " + radius + ".");
        } else {
            return String.format("The fan is " + color + " with a radius of " + radius + " and the fan is off.");
        }
    }

    /**
     * Method to access speed of the fan
     * @return speed int to the program
     */
    
    int getSpeed() {
        return speed;
    }

    /**
     * Method to access whether the fan is on or off
     * @return on boolean true (on) or false (off) to the program
     */

    boolean getOn() {
        return on;
    }

    /**
     * Method to access the radius of the fan
     * @return radius double to the program
     */

    double getRadius() {
        return radius;
    }

    /**
     * Method to access the color of the fan
     * @return color string to the program
     */

    String getColor() {
        return color;
    }

    /**
     * Method to change the speed of the fan
     * @param speed int
     */

    void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Method to turn the fan on or off
     * @param on boolean
     */

    void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Method to change the radius of the fan
     * @param radius double
     */

    void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Method to change the color of the fan
     * @param color String
     */

    void setColor(String color) {
        this.color = color;
    }

}
