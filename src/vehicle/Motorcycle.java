package vehicle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Motorcycle extends Car implements IVehicleMove {

    private static final Logger logger = LogManager.getLogger(Motorcycle.class);

    private static final String VEHICLE_TYPE = "Motorcycle"; // Final variable
    private static int totalMotorcycles; // Static variable

    private String engine;               // Ex: 500cc
    private final int wheels = 2;        // Already a final variable
    private final boolean hasABS;        // New final variable for safety feature

    // Static block
    static {
        totalMotorcycles = 0;
    }

    public Motorcycle(String make, String model, int year, String VIN, String engine, boolean hasABS, double price) {
        super(make, model, year, VIN, price);
        this.engine = engine;
        this.hasABS = hasABS; // Initialize final variable
        totalMotorcycles++;
    }

    // Static method
    public static int getTotalMotorcycles() {
        return totalMotorcycles;
    }

    // Final method
    public final void performSafetyCheck() {
        if (hasABS) {
            System.out.println("Safety check passed: ABS is installed.");
        } else {
            System.out.println("Safety check warning: ABS is not installed.");
        }
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels; // No setter since `wheels` is final
    }

    @Override
    public String getType() {
        return VEHICLE_TYPE; // Using the static final variable
    }

    @Override
    public String getTrim() {
        return engine + ", " + wheels + " wheels";
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting motorcycle with " + getEngine() + " engine.");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Motorcycle is stopping using front and rear brake pads.");
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Gas cylinder engine accelerates at a rate of " + rate + " km/h, feeling the wind rush by.");
    }
}