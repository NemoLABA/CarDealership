package vehicle;

public abstract class Car {
    private String make;
    private String model;
    private int year;
    private String VIN;    // Vehicle Identification Number

    public Car(String make, String model, int year, String VIN) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.VIN = VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make:'" + make + '\'' +
                ", model:'" + model + '\'' +
                ", year:" + year +
                ", VIN:'" + VIN + '\'' +
                '}';
    }

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model + ", VIN: " + VIN);
    }

    // Abstract methods
    public abstract String getType();
    public abstract String getTrim();
}