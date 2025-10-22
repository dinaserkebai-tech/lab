// Task 12:

class Shape12 {
    void draw() {
        System.out.println("Drawing a shape...");
    }

    double calculateArea() {
        return 0;
    }
}
class Circle12 extends Shape12 {
    double radius;

    Circle12(double radius) {
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
class Cylinder12 extends Shape12 {
    double radius;
    double height;

    Cylinder12(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Cylinder");
    }

    @Override
    double calculateArea() {
        // Общая площадь поверхности цилиндра = 2πr(h + r)
        return 2 * Math.PI * radius * (height + radius);
    }
}

public class ShapeTest12 {
    public static void main(String[] args) {
        Shape12 circle = new Circle12(5);
        Shape12 cylinder = new Cylinder12(4, 10);

        System.out.println("=== Circle ===");
        circle.draw();
        System.out.println("Area = " + circle.calculateArea());

        System.out.println("\n=== Cylinder ===");
        cylinder.draw();
        System.out.println("Total Surface Area = " + cylinder.calculateArea());
    }
}
