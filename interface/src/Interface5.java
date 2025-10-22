// Interface5.java
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class ResizableRectangle implements Resizable {
    private int width;
    private int height;

    ResizableRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Rectangle width resized to: " + width);
    }

    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Rectangle height resized to: " + height);
    }

    public void displayDimensions() {
        System.out.println("Current Rectangle dimensions: " + width + " x " + height);
    }
}

public class Interface5 {
    public static void main(String[] args) {
        ResizableRectangle rect = new ResizableRectangle(10, 5);
        rect.displayDimensions();

        rect.resizeWidth(20);
        rect.resizeHeight(15);

        rect.displayDimensions();
    }
}
