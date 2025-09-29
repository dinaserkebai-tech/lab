//1.1тапсырма
public class Circle {   // Save as "Circle.java"

    // private instance variables, not accessible outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default values */
    public Circle() {   // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius) {   // 2nd constructor
        this.radius = radius;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and color */
    public Circle(double radius, String color) {   // 3rd constructor
        this.radius = radius;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return this.radius;
    }

    /** Returns the color */
    public String getColor() {
        return this.color;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    /** Setter for radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Setter for color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return a self-descriptive string */
    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + " color=" + this.color + "]";
    }
}
