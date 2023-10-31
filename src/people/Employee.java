package people;

public class Employee extends Person {
    private int employeeId;
    private String department;

    protected Employee(Builder builder) {
        super(builder.name, builder.address, builder.city);
        this.employeeId = builder.employeeId;
        this.department = builder.department;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static class Builder {
        private String name;
        private String address;
        private String city;
        private int employeeId;
        private String department;

        public Builder(String name) {
            this.name = name;
        }

        public Builder employeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
