package test1;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Toyota";
        car.model = "Camry";
        car.year = "2020";
        car.brand = "Toyota";
        car.color = "Red";

        car.displayAllInfo();

        Bike bike = new Bike();
        bike.name = "Yamaha";
        bike.model = "R15";
        bike.year = "2021";
        bike.speed = 20;
        bike.displayAllInfo();
    }
}
