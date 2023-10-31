package people;
import java.util.Objects;

public abstract class Person {
    private String name;
    private String address;
    private String city;

    public Person(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    @Override
    public String toString() {
        return this.name + "\n  " + this.address + " " + this.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(address, person.address) &&
                Objects.equals(city, person.city);
    }

}
