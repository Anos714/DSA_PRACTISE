class Car {
    int carNo, price;
    String carModel, year, engine;

    void carInfo(String carModel, int carNo, String year) {
        System.out.println("The " + carModel + " whose car number is " + carNo + " made in year " + year);
    }

    // defaul constructor
    Car() {
        System.out.println("hello");
    }

    // parametrized constructor
    Car(int carNo, int price, String carModel, String year, String engine) {
        System.out.println("Car Details: ");
        System.out.println("Car Number: " + carNo);
        System.out.println("Car Price: " + price);
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Year: " + year);
        System.out.println("Car engine: " + engine);
    }

}

public class Objects {
    public static void main(String[] args) {
        Car c = new Car();
        Car c1 = new Car(1245, 800000, "XUV 500", "2025", "8 STROKES V6 ENGINE");
        c1.carNo = 1245;
        c1.price = 800000;
        c1.carModel = "XUV 500";
        c1.year = "2025";
        c1.engine = "8 STROKES V6 ENGINE";

        c1.carInfo(c1.carModel, c1.carNo, c1.year);

        // another class
        Animal a1 = new Animal("Tiger", "Cat", false);

        // 1st methods to send values to other class's attributes
        // a1.animalName = "Tiger";
        // a1.animalSpecies = "Cat";
        // a1.isAnimalExtinct = true;

        a1.animalInfo(a1.animalName, a1.animalSpecies, a1.isAnimalExtinct);
    }
}
