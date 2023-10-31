package vehicle;

public class Van extends Car {

    public Van(String make, String model, int year, String VIN) {
        super(make, model, year, VIN);
    }

    @Override
    public String getType() {
        return "Van";
    }

    @Override
    public String getTrim() {
        return "Cargo";  // change as necessary.
    }
}