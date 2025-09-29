//1.3
public class Rectangle {   // Save as "Rectangle.java"

    // private instance variables
    private float length;
    private float width;

    // Constructors (overloaded)
    /** Default constructor with length = 1.0f and width = 1.0f */
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    /** Constructor with given length and width */
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public float getLength() {
        return this.length;
    }

    public float getWidth() {
        return this.width;
    }

    // Setters
    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Method: getArea
    public float getArea() {
        return this.length * this.width;
    }

    // Method: getPerimeter
    public float getPerimeter() {
        return 2 * (this.length + this.width);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
    }
}
