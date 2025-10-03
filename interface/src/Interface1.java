interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 4);
        Shape c = new Circle(3);
        Shape t = new Triangle(6, 2);

        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Triangle area: " + t.getArea());
    }
}
