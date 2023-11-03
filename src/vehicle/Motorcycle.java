package vehicle;

public class Motorcycle extends Car implements StartVehicle {
    private String engine;  // Ex: 500cc
    private final int wheels = 2;

    public Motorcycle(String make, String model, int year, String VIN, String engine) {
        super(make, model, year, VIN);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    @Override
    public String getTrim() {
        return engine + ", " + wheels + " wheels";
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting motorcycle with " + getEngine() + " engine.");
    }
}
