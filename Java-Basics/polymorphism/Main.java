
public class Main {

    public static void main(String[] args) {
        Test t = new Test();
        t.add(10, 20);
        t.add(10, 20, 30);
        t.add(10.5, 20.5);

        // Test2
        Test2 t2 = new Test2();
        Test2 t3 = new Test2(10);
        Test2 t4 = new Test2(10, 20);

        // Test3
        Test3 t5 = new Test3(10, 20);
    }

}
