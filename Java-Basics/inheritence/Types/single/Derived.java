
public class Derived extends Base {
    int c;

    Derived() {
        System.out.println("Derived class constructor is called");
    }

    void displayDerived() {
        super.display();
        System.out.println("Value of c: " + c);
    }
}
