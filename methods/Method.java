
public class Method {
    // with parameters method
    static void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum: " + c);
    }

    // without parameters method (we use static here because our main method is
    // static and for static we do not need an object so we use static keyword)
    static void table() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2" + " * " + i + " = " + 2 * i);
        }
    }

    public static void main(String[] args) {
        add(3, 7);
        table();
    }

}
