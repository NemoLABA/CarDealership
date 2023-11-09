package people;

import java.util.Objects;

public final class CarSalesman extends Employee {
    private double lifetimeSales;
    private double customerSatisfactionRating;

    public CarSalesman(String name, String address, String city, int employeeId, String department, double lifetimeSales, double customerSatisfactionRating) {
        super(name, address, city, employeeId, department);
        this.lifetimeSales = lifetimeSales;
        this.customerSatisfactionRating = customerSatisfactionRating;
    }

    public double getLifetimeSales() {
        return lifetimeSales;
    }

    public void incrementLifetimeSales(double saleAmount) {
        this.lifetimeSales += saleAmount;
    }

    public double getCustomerSatisfactionRating() {
        return customerSatisfactionRating;
    }

    public void setCustomerSatisfactionRating(double customerSatisfactionRating) {
        this.customerSatisfactionRating = customerSatisfactionRating;
    }

    @Override
    public String toString() {
        return "CarSalesman{" +
                "name:'" + getName() + '\'' +
                ", address:'" + getAddress() + '\'' +
                ", city:'" + getCity() + '\'' +
                ", employeeId:" + getEmployeeId() +
                ", department:'" + getDepartment() + '\'' +
                ", lifetimeSales:" + lifetimeSales +
                ", customerSatisfactionRating:" + customerSatisfactionRating +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lifetimeSales, customerSatisfactionRating);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        CarSalesman that = (CarSalesman) obj;
        return Double.compare(that.lifetimeSales, lifetimeSales) == 0 &&
                Double.compare(that.customerSatisfactionRating, customerSatisfactionRating) == 0;
    }
}