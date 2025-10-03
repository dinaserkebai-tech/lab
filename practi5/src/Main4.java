abstract class Animal2 {
    abstract void eat();
    abstract void sleep();
}

class Lion2 extends Animal2 {
    void eat() { System.out.println("Lion eats meat"); }
    void sleep() { System.out.println("Lion sleeps in the den"); }
}

class Tiger2 extends Animal2 {
    void eat() { System.out.println("Tiger hunts and eats"); }
    void sleep() { System.out.println("Tiger sleeps in the jungle"); }
}

class Deer extends Animal2 {
    void eat() { System.out.println("Deer eats grass"); }
    void sleep() { System.out.println("Deer sleeps lightly in open fields"); }
}

public class Main4 {
    public static void main(String[] args) {
        Animal2 a1 = new Lion2();
        Animal2 a2 = new Tiger2();
        Animal2 a3 = new Deer();

        a1.eat(); a1.sleep();
        a2.eat(); a2.sleep();
        a3.eat(); a3.sleep();
    }
}
