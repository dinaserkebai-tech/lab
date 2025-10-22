// Interface6.java
interface Drawable {
    void draw(); // Аргументсіз, мән қайтармайтын әдіс
}

class DrawableCircle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class DrawableRectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class DrawableTriangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class Interface6 {
    public static void main(String[] args) {
        Drawable circle = new DrawableCircle();
        Drawable rectangle = new DrawableRectangle();
        Drawable triangle = new DrawableTriangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
