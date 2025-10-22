// Task 8:

class Shape8 {
    void draw() {
        System.out.println("Drawing a shape");
    }

    double calculateArea() {
        return 0;
    }
}
class Circle8 extends Shape8 {
    double radius;

    Circle8(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Square8 extends Shape8 {
    double side;

    Square8(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
class Triangle8 extends Shape8 {
    double base, height;

    Triangle8(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
public class ShapeTest8 {
    public static void main(String[] args) {
        Shape8 circle = new Circle8(5);
        Shape8 square = new Square8(4);
        Shape8 triangle = new Triangle8(6, 3);

        System.out.println("Circle:");
        circle.draw();
        System.out.println("Area = " + circle.calculateArea());

        System.out.println("\nSquare:");
        square.draw();
        System.out.println("Area = " + square.calculateArea());

        System.out.println("\nTriangle:");
        triangle.draw();
        System.out.println("Area = " + triangle.calculateArea());
    }
}

