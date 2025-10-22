//2 exp



class Vehicle {
    protected int speed;

    public Vehicle() {
        this.speed = 0;
    }
    public void speedUp() {
        System.out.println("Vehicle is speeding up...");
    }

    public int getSpeed() {
        return speed;
    }
}
class Car extends Vehicle {
    @Override
    public void speedUp() {
        speed += 20;
        System.out.println("Car speed increased by 20 km/h. Current speed: " + speed + " km/h");
    }
}
class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        speed += 5;
        System.out.println("Bicycle speed increased by 5 km/h. Current speed: " + speed + " km/h");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bicycle();

        myCar.speedUp();
        myBike.speedUp();
    }
}