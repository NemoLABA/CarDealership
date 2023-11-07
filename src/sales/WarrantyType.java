package sales;

public enum WarrantyType {
    BASIC(500),
    EXTENDED(1000),
    PREMIUM(1500);

    private final int cost;

    WarrantyType(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
