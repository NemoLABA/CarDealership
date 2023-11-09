package people;

import java.util.List;
import java.util.Objects;

public final class FinancialOfficer extends Employee {
    private int lifetimeLoans;
    private List<String> certifications;

    public FinancialOfficer(String name, String address, String city, int employeeId, String department, int lifetimeLoans, List<String> certifications) {
        super(name, address, city, employeeId, department);
        this.lifetimeLoans = lifetimeLoans;
        this.certifications = certifications;
    }

    public int getLifetimeLoans() {
        return lifetimeLoans;
    }

    public void setLifetimeLoans(int lifetimeLoans) {
        this.lifetimeLoans = lifetimeLoans;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    @Override
    public String toString() {
        return "FinancialOfficer{" +
                "name:'" + getName() + '\'' +
                ", address:'" + getAddress() + '\'' +
                ", city:'" + getCity() + '\'' +
                ", employeeId:" + getEmployeeId() +
                ", department:'" + getDepartment() + '\'' +
                ", lifetimeLoans:" + lifetimeLoans +
                ", certifications:" + certifications +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lifetimeLoans, certifications);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        FinancialOfficer that = (FinancialOfficer) obj;
        return lifetimeLoans == that.lifetimeLoans &&
                Objects.equals(certifications, that.certifications);
    }
}