
public class C extends A {
    int d;

    C() {
        super(); // Calls A's constructor
        System.out.println("C class constructor is called");
    }

    void displayC() {
        super.displayA();
        System.out.println("Value of d: " + d);
    }

}
