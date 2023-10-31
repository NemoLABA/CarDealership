package warranty;

public class MediumWarranty extends ExtendedWarranty {

    @Override
    protected int setCoverageMiles() {
        return 100_000; // Covers up to 100,000 miles
    }
}
