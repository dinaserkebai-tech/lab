interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle2 implements Resizable {
    int width, height;

    Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class Interface5 {
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2(10, 20);
        rect.display();

        rect.resizeWidth(30);
        rect.resizeHeight(40);
        rect.display();
    }
}
