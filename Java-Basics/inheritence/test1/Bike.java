package test1;
public class Bike extends Vehicle {
    int speed;

    Bike() {
        System.out.println("Bike class constructor is called");
    }

    void displaySpeed() {
        System.out.println("Speed: " + speed);
    }

    void displayAllInfo() {
        System.out.println("Bike Information:");
        System.out.println("Name: " + super.name);
        System.out.println("Model: " + super.model);
        System.out.println("Year: " + super.year);
        System.out.println("Speed: " + speed);
        super.startEngine();
        super.stopEngine();
        super.displayInfo();
    }

}
