
public class B extends A {
    int c;

    B() {
        super(); // Calls A's constructor
        System.out.println("B class constructor is called");
    }

    void displayB() {
        super.displayA();
        System.out.println("Value of c: " + c);
    }
}
