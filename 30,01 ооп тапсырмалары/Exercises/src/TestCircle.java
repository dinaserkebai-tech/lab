/**
 * 1.1A Test Driver for the Circle class
 */
public class TestCircle {   // Save as "TestCircle.java"
    public static void main(String[] args) {
        // Test default constructor
        Circle c1 = new Circle();
        System.out.println("c1 radius: " + c1.getRadius() + ", area: " + c1.getArea() + ", color: " + c1.getColor());

        // Test constructor with radius only
        Circle c2 = new Circle(2.0);
        System.out.println("c2 radius: " + c2.getRadius() + ", area: " + c2.getArea() + ", color: " + c2.getColor());

        // Test constructor with radius and color
        Circle c3 = new Circle(3.0, "blue");
        System.out.println("c3 radius: " + c3.getRadius() + ", area: " + c3.getArea() + ", color: " + c3.getColor());

        // Test setters
        Circle c4 = new Circle();
        c4.setRadius(5.5);
        c4.setColor("green");
        System.out.println("c4 radius is: " + c4.getRadius());
        System.out.println("c4 color is: " + c4.getColor());

        // Test toString()
        Circle c5 = new Circle(6.6, "yellow");
        System.out.println(c5.toString()); // explicit
        System.out.println(c5);            // implicit
        System.out.println("Operator '+' invokes toString(): " + c5);
    }
}
