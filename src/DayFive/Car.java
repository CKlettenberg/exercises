package DayFive;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Car {
    // Properties (fields) of the class
    String brand;
    String model;
    int year;

    // Default constructor
    public Car() {
        brand = "Not specified";
        model = "Unknown";
        year = 2018;
    }

    public Car(String brand,String model, int year) {
        //Parameterized constructor
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car();
        Car car2 = new Car("Honda","Civic",2010);

        // Calling the method to display details of each car
        car1.displayDetails();
        System.out.println(" ");

        car2.displayDetails();
    }


    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    //override toString method return a string representation
    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", year=" + year + "]";
    }

}