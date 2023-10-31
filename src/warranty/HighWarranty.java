package warranty;

public class HighWarranty extends ExtendedWarranty {

    @Override
    protected int setCoverageMiles() {
        return 150_000; // Covers up to 150,000 miles
    }
}
