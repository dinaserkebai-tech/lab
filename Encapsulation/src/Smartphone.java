//9 exp



public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity; // in GB
    public Smartphone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            storageCapacity += additionalStorage;
            System.out.println("Storage increased by " + additionalStorage + "GB.");
        } else {
            System.out.println("Invalid storage amount. Must be greater than 0.");
        }
    }
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy S22", 128);

        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage: " + phone.getStorageCapacity() + "GB");
        phone.increaseStorage(64); // Valid
        System.out.println("Updated Storage: " + phone.getStorageCapacity() + "GB");

        phone.increaseStorage(-20); // Invalid
    }
}