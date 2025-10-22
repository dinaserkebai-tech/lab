//6 exp


public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;
    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }
    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }
    public String getModelName() {
        return model_name;
    }

    public void setModelName(String model_name) {
        this.model_name = model_name;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public double getMileage() {
        return mileage;
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020, 35000.5);
        System.out.println("Company: " + myCar.getCompanyName());
        System.out.println("Model: " + myCar.getModelName());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage());

        myCar.setCompanyName("Honda");
        myCar.setModelName("Civic");
        myCar.setYear(2025);

        System.out.println("\nUpdated Car Info:");
        System.out.println("Company: " + myCar.getCompanyName());
        System.out.println("Model: " + myCar.getModelName());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage()); // Still read-only
    }
}
