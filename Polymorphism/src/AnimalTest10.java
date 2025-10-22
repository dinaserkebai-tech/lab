// Task 10:

class Animal10 {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sound() {
        System.out.println("This animal makes a sound.");
    }
}
class Lion10 extends Animal10 {
    @Override
    void eat() {
        System.out.println("Lion eats meat and hunts large animals.");
    }

    @Override
    void sound() {
        System.out.println("Lion roars loudly: ROARRR!");
    }
}

class Tiger10 extends Animal10 {
    @Override
    void eat() {
        System.out.println("Tiger eats deer, boars, and other prey.");
    }

    @Override
    void sound() {
        System.out.println("Tiger growls fiercely: Grrr!");
    }
}

class Panther10 extends Animal10 {
    @Override
    void eat() {
        System.out.println("Panther eats small mammals, birds, and reptiles.");
    }

    @Override
    void sound() {
        System.out.println("Panther snarls softly: Hsss!");
    }
}
public class AnimalTest10 {
    public static void main(String[] args) {
        Animal10 lion = new Lion10();
        Animal10 tiger = new Tiger10();
        Animal10 panther = new Panther10();

        System.out.println("=== Lion ===");
        lion.eat();
        lion.sound();

        System.out.println("\n=== Tiger ===");
        tiger.eat();
        tiger.sound();

        System.out.println("\n=== Panther ===");
        panther.eat();
        panther.sound();
    }
}
