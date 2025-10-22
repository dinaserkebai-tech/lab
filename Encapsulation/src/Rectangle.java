//3 exp
public class Rectangle {
    private double length;
    private double width;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5.5);
        rect.setWidth(3.2);
        rect.displayInfo();
    }
}
