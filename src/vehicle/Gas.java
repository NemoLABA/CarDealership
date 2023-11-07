package vehicle;

public final class Gas extends Car implements IVehicleMove {
    private static final String VEHICLE_TYPE = "Gas"; // Final variable
    private static int totalGasVehicles; // Static variable

    private final String engineType;     // Final variable for demonstration
    private String engine;               // Ex: 5.4L
    private String drive;                // Ex: FWD, RWD, AWD

    // Static block
    static {
        totalGasVehicles = 0;
    }

    public Gas(String make, String model, int year, String VIN, String engine, String drive, String engineType) {
        super(make, model, year, VIN);
        this.engine = engine;
        this.drive = drive;
        this.engineType = engineType; // Initialize final variable
        totalGasVehicles++; // Increment the number of gas vehicles every time a new instance is created
    }

    // Static method
    public static int getTotalGasVehicles() {
        return totalGasVehicles;
    }

    // Final method for demonstration
    public final void performEmissionTest() {
        System.out.println("Performing emission test for the gas car with engine type " + engineType + ".");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String getType() {
        return VEHICLE_TYPE; // Using the static final variable
    }

    @Override
    public String getTrim() {
        return engine + ", " + drive;
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting gas engine with " + getEngine() + ".");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Gas car is stopping using traditional brake pads.");
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Gas engine builds up an acceleration at a rate of " + rate + " km/h.");
    }
}