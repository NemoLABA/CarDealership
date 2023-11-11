package cardealership;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import people.CarSalesman;
import people.Customer;
import people.Employee;
import vehicle.Car;
import vehicle.Electric;
import vehicle.Gas;
import vehicle.Motorcycle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDealership {

    private static final Logger LOGGER = LogManager.getLogger(CarDealership.class);

    private List<Car> allVehicles = new ArrayList<>();
    private List<Car> vehiclesSold = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addVehicle(Car vehicle) {
        allVehicles.add(vehicle);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean sellVehicle(CarSalesman salesman, Customer customer, Car vehicle, double salePrice) {
        if (allVehicles.contains(vehicle)) {
            allVehicles.remove(vehicle);
            vehiclesSold.add(vehicle);

            customer.incrementVehiclesPurchased();
            salesman.incrementLifetimeSales(salePrice);

            LOGGER.info("Congratulations, the vehicle is yours!");
            LOGGER.info("Salesman's lifetime sales: " + salesman.getLifetimeSales());
            LOGGER.info("Customer's vehicles purchased: " + customer.getVehiclesPurchased());

            return true;
        } else {
            printSaleStatus(false, salesman, customer);  // Call printSaleStatus for failure
            return false;
        }
    }

    public void printSaleStatus(boolean saleStatus, CarSalesman salesman, Customer customer) {
        if (!saleStatus) {
            LOGGER.error("Vehicle not in stock, sale not completed.");
        }
    }

    public List<Car> getGasCars() {
        return allVehicles.stream()
                .filter(v -> v instanceof Gas)
                .map(v -> (Gas) v)
                .collect(Collectors.toList());
    }

    public List<Car> getElectricCars() {
        return allVehicles.stream()
                .filter(v -> v instanceof Electric)
                .map(v -> (Electric) v)
                .collect(Collectors.toList());
    }

    public List<Car> getMotorcycles() {
        return allVehicles.stream()
                .filter(v -> v instanceof Motorcycle)
                .map(v -> (Motorcycle) v)
                .collect(Collectors.toList());
    }

    public List<Car> getAllVehicles() {
        return allVehicles;
    }

    public List<Car> getVehiclesSold() {
        return vehiclesSold;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}