package test1;
public class Car extends Vehicle {
    public String brand, color;

    Car() {
        System.out.println("Car class constructor is called");
    }

    void AC() {
        System.out.println("AC is working...");
    }

    void displayAllInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Model: " + super.model);
        System.out.println("Year: " + super.year);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);

        super.startEngine();
        super.stopEngine();
        super.displayInfo();
    }

   

}
