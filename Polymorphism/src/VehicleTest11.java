// Task 11:

class Vehicle11 {
    void startEngine() {
        System.out.println("The vehicle's engine starts.");
    }

    void stopEngine() {
        System.out.println("The vehicle's engine stops.");
    }
}
class Car11 extends Vehicle11 {
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key ignition or button press.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stops after turning off the key or pressing the stop button.");
    }
}
class Motorcycle11 extends Vehicle11 {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a kick or electric starter.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stops when the rider turns off the switch.");
    }
}
public class VehicleTest11 {
    public static void main(String[] args) {
        Vehicle11 car = new Car11();
        Vehicle11 motorcycle = new Motorcycle11();

        System.out.println("=== Car ===");
        car.startEngine();
        car.stopEngine();

        System.out.println("\n=== Motorcycle ===");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
