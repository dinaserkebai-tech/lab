interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is hovering in the air");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Flyable f1 = new Spacecraft();
        Flyable f2 = new Airplane();
        Flyable f3 = new Helicopter();

        f1.fly_obj();
        f2.fly_obj();
        f3.fly_obj();
    }
}
