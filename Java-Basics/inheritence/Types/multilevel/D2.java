
public class D2 extends D1 {
    int d;

    D2() {
        System.out.println("D2 class constructor is called");
    }

    void displayD2() {
        super.displayD1();
        System.out.println("Value of d: " + d);
    }

}
