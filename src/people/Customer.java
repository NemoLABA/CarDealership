package people;

import java.util.Objects;

public class Customer extends Person {
    private String phoneNumber;
    private int vehiclesPurchased;

    public Customer(String name, String address, String city, String phoneNumber) {
        super(name, address, city);
        this.phoneNumber = phoneNumber;
        this.vehiclesPurchased = 0;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getVehiclesPurchased() {
        return vehiclesPurchased;
    }

    public void incrementVehiclesPurchased() {
        this.vehiclesPurchased++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", city='" + getCity() + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", vehiclesPurchased=" + vehiclesPurchased +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phoneNumber, vehiclesPurchased);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return vehiclesPurchased == customer.vehiclesPurchased &&
                Objects.equals(phoneNumber, customer.phoneNumber);
    }
}