abstract class Shape2D {
    abstract void draw();
    abstract void resize();
}

class Rectangle extends Shape2D {
    void draw() { System.out.println("Drawing a rectangle"); }
    void resize() { System.out.println("Resizing rectangle"); }
}

class Circle2D extends Shape2D {
    void draw() { System.out.println("Drawing a circle"); }
    void resize() { System.out.println("Resizing circle"); }
}

public class Main10 {
    public static void main(String[] args) {
        Shape2D r = new Rectangle();
        Shape2D c = new Circle2D();
        r.draw(); r.resize();
        c.draw(); c.resize();
    }
}
