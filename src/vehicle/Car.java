package vehicle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public abstract class Car {

    private static final Logger LOGGER = LogManager.getLogger(Car.class);

    private String make;
    private String model;
    private int year;
    private String VIN;    // Vehicle Identification Number
    private double price;

    public Car(String make, String model, int year, String VIN, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.VIN = VIN;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make:'" + make + '\'' +
                ", model:'" + model + '\'' +
                ", year:" + year +
                ", VIN:'" + VIN + '\'' +
                ", price: " + price +
                '}';
    }

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model + ", VIN: " + VIN + ", Price: $" + price);
    }

    // Abstract methods (must be implemented by the child classes)
    public abstract String getType();
    public abstract String getTrim();

    private static final String ALPHANUMERIC_UPPERCASE = "ABCDEFGHJKLMNPRSTUVWXYZ1234567890";
    private static final int VIN_LENGTH = 17;

    public static String generateMockVIN() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < VIN_LENGTH; i++) {
            int index = random.nextInt(ALPHANUMERIC_UPPERCASE.length());
            char randomChar = ALPHANUMERIC_UPPERCASE.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}