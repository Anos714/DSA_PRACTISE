
public class Carrot extends Vegetable {
    String variety;

    Carrot() {
        System.out.println("Carrot class constructor is called");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Variety: " + variety);
    }
}
