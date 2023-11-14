package cardealership;

import exceptions.InvalidEmployeeException;
import exceptions.InvalidVehicleException;
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

    public boolean sellVehicle(CarSalesman salesman, Customer customer, Car vehicle, double salePrice) throws InvalidVehicleException {
        if (allVehicles.contains(vehicle)) {
            // Proceed with the sale
            allVehicles.remove(vehicle);
            vehiclesSold.add(vehicle);

            customer.incrementVehiclesPurchased();
            salesman.incrementLifetimeSales(salePrice);

            LOGGER.info("Congratulations, the vehicle is yours!");
            LOGGER.info("Salesman's lifetime sales: " + salesman.getLifetimeSales());
            LOGGER.info("Customer's vehicles purchased: " + customer.getVehiclesPurchased());
            return true;
        } else {
            // If sale fails
            try {
                printSaleStatus(false, salesman, customer, vehicle);
            } catch (InvalidVehicleException e) {
                LOGGER.error("Sale failed: " + e.getMessage());
            }
            return false;
        }
    }

    public void printSaleStatus(boolean saleStatus, CarSalesman salesman, Customer customer, Car vehicle) throws InvalidVehicleException {
        if (saleStatus) {
            // Sale successful
            LOGGER.info("Sale successful for salesman " + salesman.getName() + " and customer " + customer.getName());
        } else {
            // Check if the failure is due to vehicle not being in stock
            if (!checkForVehicle(vehicle)) {
                LOGGER.error("Vehicle not in stock, sale not completed for salesman " + salesman.getName() + " and customer " + customer.getName());
                throw new InvalidVehicleException("Vehicle not in stock");
            } else {
                // Sale failed due to other reasons
                LOGGER.error("Sale failed for salesman " + salesman.getName() + " and customer " + customer.getName());
            }
        }
    }

    public void validateEmployee(int employeeId) throws InvalidEmployeeException {
        boolean employeeExists = employees.stream()
                .anyMatch(e -> e.getEmployeeId() == employeeId);
        if (!employeeExists) {
            LOGGER.error("Logger.Error: employee not found by ID: " + employeeId);
            throw new InvalidEmployeeException("Employee not found by ID: " + employeeId);
        }
    }

    public boolean checkForVehicle(Car vehicle) {
        return allVehicles.contains(vehicle);
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