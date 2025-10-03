abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    void eat() { System.out.println("Athlete eats healthy food"); }
    void exercise() { System.out.println("Athlete trains daily"); }
}

class LazyPerson extends Person {
    void eat() { System.out.println("Lazy person eats junk food"); }
    void exercise() { System.out.println("Lazy person rarely exercises"); }
}

public class Main8 {
    public static void main(String[] args) {
        Person a = new Athlete();
        Person l = new LazyPerson();
        a.eat(); a.exercise();
        l.eat(); l.exercise();
    }
}
