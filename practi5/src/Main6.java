abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    double radius;
    Sphere(double radius) { this.radius = radius; }

    double calculateVolume() { return (4.0/3) * Math.PI * Math.pow(radius, 3); }
    double calculateSurfaceArea() { return 4 * Math.PI * radius * radius; }
}

class Cube extends Shape3D {
    double side;
    Cube(double side) { this.side = side; }

    double calculateVolume() { return Math.pow(side, 3); }
    double calculateSurfaceArea() { return 6 * side * side; }
}

public class Main6 {
    public static void main(String[] args) {
        Shape3D s = new Sphere(5);
        Shape3D c = new Cube(3);

        System.out.println("Sphere Volume: " + s.calculateVolume());
        System.out.println("Sphere Surface Area: " + s.calculateSurfaceArea());

        System.out.println("Cube Volume: " + c.calculateVolume());
        System.out.println("Cube Surface Area: " + c.calculateSurfaceArea());
    }
}
