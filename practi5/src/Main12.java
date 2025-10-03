abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

class Triangle2 extends GeometricShape {
    double a, b, c;
    Triangle2(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }

    double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double perimeter() { return a+b+c; }
}

class Square extends GeometricShape {
    double side;
    Square(double side) { this.side = side; }

    double area() { return side*side; }
    double perimeter() { return 4*side; }
}

public class Main12 {
    public static void main(String[] args) {
        GeometricShape t = new Triangle2(3,4,5);
        GeometricShape s = new Square(4);

        System.out.println("Triangle area: " + t.area());
        System.out.println("Triangle perimeter: " + t.perimeter());
        System.out.println("Square area: " + s.area());
        System.out.println("Square perimeter: " + s.perimeter());
    }
}
