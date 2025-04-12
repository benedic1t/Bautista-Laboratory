
import java.util.Scanner;

//Parent Class
public class Vehicle{
    private String brand;
    private int speed;
    private String fuelType;

    //Constructor
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }
    //getter methods
    private int getSpeed() {
        return speed;
    }

    private String getFuelType() {
        return fuelType;
    }
    
    private String getBrand() {
        return brand;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getSpeed() + " km/h");
        System.out.println("Fuel Type: " + getFuelType());
    }

    public static class Car extends Vehicle {
        private int numberOfDoors;
        
        //Constructor  
        public Car(String brand, int speed, String fuelType, int numberOfDoors) {
            super(brand, speed, fuelType);
            this.numberOfDoors = numberOfDoors;
        }
       
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of Doors: " + numberOfDoors);
        }
    }
    public static class Motorcycle extends Vehicle {
        private String hasSidecar; 

        public Motorcycle(String brand, int speed, String fuelType, String hasSidecar) {
            super(brand, speed, fuelType);
            this.hasSidecar = hasSidecar;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Has Sidecar: " + hasSidecar);
        }
    }
    
    //Main Method
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int choice;
        do{
        System.out.println("Enter 1 for Car or 2 for Motorcycle: ");
        choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter brand: ");
                String brand = scan.next();
                
                System.out.print("Enter speed: ");
                int speed = scan.nextInt();
                
                System.out.print("Enter fuel type: ");
                String fuelType = scan.next();
                
                System.out.print("Enter number of doors: ");
                int numberOfDoors = scan.nextInt();
                
                Car car = new Car(brand, speed, fuelType, numberOfDoors);
                car.displayInfo();
                break;
            case 2:
                System.out.print("Enter brand: ");
                brand = scan.next();
                
                System.out.print("Enter speed: ");
                speed = scan.nextInt();
                
                System.out.print("Enter fuel type: ");
                fuelType = scan.next();
                
                System.out.print("Does it have a sidecar (Yes/No): ");

                String hasSidecar = scan.next();
                
                Motorcycle motorcycle = new Motorcycle(brand, speed, fuelType, hasSidecar);
                motorcycle.displayInfo();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        System.out.print("\nDo you want to continue? (1 for yes /2 for no): ");
        choice = scan.nextInt();
        } while(choice == 1);
        System.out.println("Exiting the program.");
    }
}