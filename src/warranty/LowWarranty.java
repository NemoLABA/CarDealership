package warranty;

public class LowWarranty extends ExtendedWarranty {

    @Override
    protected int setCoverageMiles() {
        return 50_000; // Covers up to 50,000 miles
    }
}