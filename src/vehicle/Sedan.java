package vehicle;

public class Sedan extends Car {

    public Sedan(String make, String model, int year, String VIN) {
        super(make, model, year, VIN);
    }

    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public String getTrim() {
        return "Basic";  // change as necessary.
    }
}