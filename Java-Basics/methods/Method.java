
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

    static int multiply(int a, int b) {
        int ans = a * b;
        return ans;
    }

    static void kala() {
        int result = multiply(20, 22);
        System.out.println("Result: " + result);
    }

    static boolean isValid(int age) {
        if (age >= 18)
            return true;
        else
            return false;
    }

    /*
     * Que. what is method signature?
     * Ans. a method signature is an entity that contains method's return type,
     * method's name and method's parameters
     * ex:- void printSum(int x, int y)
     * 
     */

    // table method with parameter
    static void numberTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // method overloading(same name methods but with different parameters)
    static int Rahul(int a) {
        return a + 10;
    }

    static int Rahul(int a, int b) {
        return a + b;
    }

    static double Rahul(double a, double b) {
        return a + b;
    }

    // call by value method
    static void solve(int num) {
        System.out.println("num: " + num);
        num *= 10;
        System.out.println("num10: " + num);
    }

    public static void main(String[] args) {
        add(3, 7);
        table();
        numberTable(45);// here 45 i give in method is argument

        int ans = multiply(20, 70);
        System.out.println(ans);
        System.out.println(isValid(21));
        kala();

        System.out.println(Rahul(12));
        System.out.println(Rahul(20, 30));
        System.out.println(Rahul(12.34, 34.98766));

        // call by value
        int num = 5;
        solve(num);
        System.out.println("num: " + num);

        // instance varibale of another class
        Demo d = new Demo();
        System.out.println("Value of Demo class's x: " + d.x);
    }

}

class Demo {
    int x = 10;
}
