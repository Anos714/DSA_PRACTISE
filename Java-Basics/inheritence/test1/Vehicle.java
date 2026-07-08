package test1;

class Vehicle {
    public String name, model, year;

    Vehicle() {
        System.out.println("Vehicle class constructor is called");
    }

    void startEngine() {
        System.out.println("Engine is starting...");
    }

    void stopEngine() {
        System.out.println("Engine is stopping...");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

}
