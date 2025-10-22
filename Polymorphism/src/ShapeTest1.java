// Task6:

class Shape6 {
    double getArea() {
        return 0;
    }

    double getPerimeter() {
        return 0;
    }
}

class Circle6 extends Shape6 {
    double radius;

    Circle6(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle6 extends Shape6 {
    double length, width;

    Rectangle6(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle6 extends Shape6 {
    double a, b, c;

    Triangle6(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}

public class ShapeTest1 {
    public static void main(String[] args) {
        Shape6 circle = new Circle6(5);
        Shape6 rectangle = new Rectangle6(4, 6);
        Shape6 triangle = new Triangle6(3, 4, 5);

        System.out.println("Circle:");
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimeter = " + triangle.getPerimeter());
    }
}
