
public class Lion extends Animal {
    int age;

    Lion() {
        System.out.println("Lion class constructor is called");
    }

    void displayAllInfo() {
        System.out.println("Lion Information:");
        System.out.println("Name: " + super.name);
        System.out.println("Species: " + super.species);
        System.out.println("Color: " + super.color);
        System.out.println("Age: " + age);
        super.displayInfo();
    }

}
