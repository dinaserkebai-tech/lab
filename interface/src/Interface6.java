interface Drawable {
    void draw();
}

class Circle2 implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle3 implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle2 implements Drawable {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class Interface6 {
    public static void main(String[] args) {
        Drawable d1 = new Circle2();
        Drawable d2 = new Rectangle3();
        Drawable d3 = new Triangle2();

        d1.draw();
        d2.draw();
        d3.draw();
    }
}
