package people;
import exceptions.InvalidNameException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class Person {

    private static final Logger logger = LogManager.getLogger(Person.class);

    private String name;
    private String address;
    private String city;

    public Person(String name, String address, String city) throws InvalidNameException {
        this.setName(name);
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws InvalidNameException {
        if (name == null || name.length() < 5 || name.length() > 30 || !name.contains(" ")) {
            logger.error("Not within Parameters", name);
            throw new InvalidNameException("Name is invalid");
        }
        logger.info("Success, Welcome: {}", name);
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
