package vehicle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Electric extends Car implements IVehicleMove {
    private static final Logger logger = LogManager.getLogger(Electric.class);
    private static final String VEHICLE_TYPE = "Electric"; // Final variable
    private static int totalElectricVehicles; // Static variable
    private int batteryPower;    // In kWh
    private int motors;          // Number of motors
    private final int batteryCapacity; // In kWh

    // Static block
    static {
        totalElectricVehicles = 0;
    }

    public Electric(String make, String model, int year, String VIN, int batteryPower, int motors, int batteryCapacity, double price) {
        super(make, model, year, VIN, price);
        this.batteryPower = batteryPower;
        this.motors = motors;
        this.batteryCapacity = batteryCapacity;
        totalElectricVehicles++; // Static variable
    }

    // Static method
    public static int getTotalElectricVehicles() {
        return totalElectricVehicles;
    }
    //Final method
    public final void chargeBattery() {
        System.out.println("Charging battery...");
    }
    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getMotors() {
        return motors;
    }

    public void setMotors(int motors) {
        this.motors = motors;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    @Override
    public String getType() {
        return VEHICLE_TYPE; // Using the static final variable
    }

    @Override
    public String getTrim() {
        return batteryPower + "kWh, " + motors + " motors";
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting electric car with " + getMotors() + " motors.");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Electric car is stopping using regenerative braking");
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Electric car insanely keeps the same rate of " + rate + " km/h using instant torque.");
    }
}
