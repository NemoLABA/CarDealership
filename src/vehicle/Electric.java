package vehicle;

public class Electric extends Car implements IVehicleMove {
    private int batteryPower;    // In kWh
    private int motors;          // Number of motors

    public Electric(String make, String model, int year, String VIN, int batteryPower, int motors) {
        super(make, model, year, VIN);
        this.batteryPower = batteryPower;
        this.motors = motors;
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

    @Override
    public String getType() {
        return "Electric";
    }

    @Override
    public String getTrim() {
        return batteryPower + "kWh, " + motors + " motors";
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting electric car with " + getMotors() + " motors.");
    }
}
