package sales;

public abstract class ExtendedWarranty {
    protected int coverageMiles;

    public ExtendedWarranty() {
        this.coverageMiles = setCoverageMiles();
    }

    protected abstract int setCoverageMiles();

    public int getCoverageMiles() {
        return coverageMiles;
    }

    @Override
    public String toString() {
        return "ExtendedWarranty with coverage up to " + coverageMiles + " miles.";
    }
}