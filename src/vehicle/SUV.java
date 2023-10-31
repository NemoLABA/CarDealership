package vehicle;

public class SUV extends Car {

    public SUV(String make, String model, int year, String VIN) {
        super(make, model, year, VIN);
    }

    @Override
    public String getType() {
        return "SUV";
    }

    @Override
    public String getTrim() {
        return "Standard";  // change as necessary.
    }
}