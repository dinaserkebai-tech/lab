//10 exp


public class Desktop {
    private String brand;
    private String processor;
    private int ramSize; // in GB
    public Desktop(String brand, String processor, int ramSize) {
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public void upgradeRam(int additionalRam) {
        if (additionalRam > 0) {
            ramSize += additionalRam;
            System.out.println("RAM upgraded by " + additionalRam + "GB.");
        } else {
            System.out.println("Invalid RAM upgrade value. Must be greater than 0.");
        }
    }
    public static void main(String[] args) {
        Desktop myDesktop = new Desktop("Dell", "Intel Core i7", 16);

        System.out.println("Brand: " + myDesktop.getBrand());
        System.out.println("Processor: " + myDesktop.getProcessor());
        System.out.println("RAM Size: " + myDesktop.getRamSize() + "GB");
        myDesktop.upgradeRam(8); // Valid upgrade
        System.out.println("Updated RAM Size: " + myDesktop.getRamSize() + "GB");

        myDesktop.upgradeRam(-4); // Invalid upgrade
    }
}