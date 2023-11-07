package vehicle;

public class Gas extends Car implements IVehicleMove {
    private String engine;  // Ex: 5.4L
    private String drive;   // Ex: FWD, RWD, AWD

    public Gas(String make, String model, int year, String VIN, String engine, String drive) {
        super(make, model, year, VIN);
        this.engine = engine;
        this.drive = drive;
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
        return "Gas";
    }

    @Override
    public String getTrim() {
        return engine + ", " + drive;
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting gas engine with " + getEngine() + ".");
    }
}

