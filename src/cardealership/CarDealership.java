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

public class CarDealership {
    private static final Logger logger = LogManager.getLogger(CarDealership.class);
    private List<Gas> gasCars = new ArrayList<>();
    private List<Electric> electricCars = new ArrayList<>();
    private List<Motorcycle> motorcycles = new ArrayList<>();
    private List<Car> allVehicles = new ArrayList<>();
    private List<Car> vehiclesSold = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void addVehicle(Car vehicle) {
        allVehicles.add(vehicle);

        if (vehicle instanceof Gas) {
            gasCars.add((Gas) vehicle);
        } else if (vehicle instanceof Electric) {
            electricCars.add((Electric) vehicle);
        } else if (vehicle instanceof Motorcycle) {
            motorcycles.add((Motorcycle) vehicle);
        }
    }

    public boolean sellVehicle(CarSalesman salesman, Customer customer, Car vehicle, double salePrice) {
        if (allVehicles.contains(vehicle)) {
            allVehicles.remove(vehicle);
            vehiclesSold.add(vehicle);

            if (vehicle instanceof Gas) {
                gasCars.remove((Gas) vehicle);
            } else if (vehicle instanceof Electric) {
                electricCars.remove((Electric) vehicle);
            } else if (vehicle instanceof Motorcycle) {
                motorcycles.remove((Motorcycle) vehicle);
            }

            customer.incrementVehiclesPurchased();
            salesman.incrementLifetimeSales(salePrice);

            return true;
        }
        return false;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void printSaleStatus(boolean saleStatus, CarSalesman salesman, Customer customer) {
        if (saleStatus) {
            System.out.println("Congratulations, the vehicle is yours!");
            System.out.println("Salesman's lifetime sales: " + salesman.getLifetimeSales());
            System.out.println("Customer's vehicle's purchased: " + customer.getVehiclesPurchased());
        } else {
            System.out.println("Vehicle not in stock, sale not completed.");
        }
    }

    public List<Gas> getGasCars() {
        return gasCars;
    }

    public List<Electric> getElectricCars() {
        return electricCars;
    }

    public List<Motorcycle> getMotorcycles() {
        return motorcycles;
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