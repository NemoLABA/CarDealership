package people;
import java.util.Objects;

public final class FinancialOfficer extends Employee {

    public FinancialOfficer(String name, String address, String city, int employeeId, String department) {
        super(name, address, city, employeeId, department);
    }

    @Override
    public String toString() {
        return "FinancialOfficer{" +
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        FinancialOfficer that = (FinancialOfficer) obj;
        return getEmployeeId() == that.getEmployeeId() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getAddress(), that.getAddress()) &&
                Objects.equals(getCity(), that.getCity()) &&
                Objects.equals(getDepartment(), that.getDepartment());
    }

}