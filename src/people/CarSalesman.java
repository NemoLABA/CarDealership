package people;

import java.util.Objects;

public class CarSalesman extends Employee {

    public CarSalesman (Builder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "CarSalesman{" +
                "name:'" + getName() + '\'' +
                ", address:'" + getAddress() + '\'' +
                ", city:'" + getCity() + '\'' +
                ", employeeId:" + getEmployeeId() +
                ", department:'" + getDepartment() + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getCity(), getEmployeeId(), getDepartment());
    }

    public static class Builder extends Employee.Builder {
        public Builder(String name) {
            super(name);
        }

        @Override
        public CarSalesman build() {
            return new CarSalesman(this);
        }
    }
}