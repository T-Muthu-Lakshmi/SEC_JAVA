class Car {
    String model;
    int year;

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class CarDemo {
    public static void main(String[] args) {

        // Creating an object of Car
        Car c1 = new Car();

        // Setting values
        c1.model = "Honda City";
        c1.year = 2020;

        // Displaying car details
        c1.displayInfo();
    }
}
