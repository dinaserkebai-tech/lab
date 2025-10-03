abstract class Bird {
    abstract void fly();
    abstract void makeSound();
}

class Eagle extends Bird {
    void fly() { System.out.println("Eagle soars high in the sky"); }
    void makeSound() { System.out.println("Eagle screeches"); }
}

class Hawk extends Bird {
    void fly() { System.out.println("Hawk flies swiftly"); }
    void makeSound() { System.out.println("Hawk cries"); }
}

public class Main11 {
    public static void main(String[] args) {
        Bird e = new Eagle();
        Bird h = new Hawk();
        e.fly(); e.makeSound();
        h.fly(); h.makeSound();
    }
}
