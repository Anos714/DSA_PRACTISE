
public class D1 extends Base {
    int c;

    D1() {
        System.out.println("D1 class constructor is called");
    }

    void displayD1() {
        super.display();
        System.out.println("Value of c: " + c);
    }

}
