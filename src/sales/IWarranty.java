package sales;

public interface IWarranty {
    void extendWarranty(WarrantyType type);
    boolean isWarrantyValid();
}