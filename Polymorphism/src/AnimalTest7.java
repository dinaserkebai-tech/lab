// Task 7:

class Animal7 {
    void move() {
        System.out.println("Animal moves");
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Bird7 extends Animal7 {
    @Override
    void move() {
        System.out.println("Bird flies in the sky");
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

class Panthera7 extends Animal7 {
    @Override
    void move() {
        System.out.println("Panthera prowls gracefully");
    }

    @Override
    void makeSound() {
        System.out.println("Panthera roars loudly");
    }
}

public class AnimalTest7 {
    public static void main(String[] args) {
        Animal7 bird = new Bird7();
        Animal7 panthera = new Panthera7();

        System.out.println("Bird:");
        bird.move();
        bird.makeSound();

        System.out.println("\nPanthera:");
        panthera.move();
        panthera.makeSound();
    }
}
