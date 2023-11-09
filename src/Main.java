import cardealership.CarDealership;
import people.CarSalesman;
import people.Customer;
import vehicle.Electric;
import vehicle.Gas;
import vehicle.Motorcycle;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDealership dealership = new CarDealership();

        Gas gasCar = new Gas("Chevrolet", "Spark", 2019, "1G1FF1R70K0145678", "V6", "AWD", "Standard", 15000);
        Electric electricCar = new Electric("Nissan", "Leaf", 2020, "1N4AZ0CP4FC336789", 40, 2, 150, 20000);
        Motorcycle motorcycle = new Motorcycle("BMW", "S 1000 RR", 2024, "2DMV8VR46LB001234", "1103cc", false, 10000);

        // Adding vehicles to the dealership
        dealership.addVehicle(gasCar);
        dealership.addVehicle(electricCar);
        dealership.addVehicle(motorcycle);

        // Creating a salesman
        CarSalesman salesman = new CarSalesman("Tabitha Jones", "8050 Lee St", "Uptown", 183, "Sales", 120000.0, 5.0);

        // Creating a customer
        Customer customer = new Customer("Reese Witherspoon", "1940 East Idaho", "Fairfield", "123-456-7890");

        // Perform a vehicle sale
        boolean saleStatus = dealership.sellVehicle(salesman, customer, motorcycle, 10000);

        // Prints the sale status
        dealership.printSaleStatus(saleStatus, salesman, customer);

        // Retrieving the specific lists
        List<Gas> gasCars = dealership.getGasCars();
        List<Electric> electricCars = dealership.getElectricCars();
        List<Motorcycle> motorcycles = dealership.getMotorcycles();

        // Printing out the total number of vehicles
        System.out.println("Dealer's Inventory:");
        System.out.println("Total gas cars: " + gasCars.size());
        System.out.println("Total electric cars: " + electricCars.size());
        System.out.println("Total motorcycles: " + motorcycles.size());
    }
}