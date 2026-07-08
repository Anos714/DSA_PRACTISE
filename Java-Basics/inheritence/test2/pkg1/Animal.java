
public class Animal {
    protected String name, species, color;

    Animal() {
        System.out.println("Animal class constructor is called");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
    }
}
