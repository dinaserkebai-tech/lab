//1.2
public class Circle {

    // private instance variable
    private double radius;

    // Constructors (overloaded)
    /** Default constructor with radius = 1.0 */
    public Circle() {
        this.radius = 1.0;
    }

    /** Constructor with given radius */
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method: getArea
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // Method: getCircumference
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
}
