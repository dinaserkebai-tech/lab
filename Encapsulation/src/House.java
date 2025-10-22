//11 exp


public class House {
    private String address;
    private int numberOfRooms;
    private double area;
    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double calculatePrice(double pricePerSquareMeter) {
        if (pricePerSquareMeter < 0) {
            System.out.println("Invalid price per square meter.");
            return 0;
        }
        return area * pricePerSquareMeter;
    }
    public static void main(String[] args) {
        House myHouse = new House("123 Elm Street", 4, 120.5);

        System.out.println("Address: " + myHouse.getAddress());
        System.out.println("Rooms: " + myHouse.getNumberOfRooms());
        System.out.println("Area: " + myHouse.getArea() + " sq.m");
        double price = myHouse.calculatePrice(1500); // price per square meter
        System.out.println("Estimated Price: $" + price);
    }
}