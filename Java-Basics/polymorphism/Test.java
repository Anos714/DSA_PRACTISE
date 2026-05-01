/*
 * 1. Commpile Time Polymorphism->
 * types:-
 * a) Method Overloading
 * b) Constructor Overloading
 * c) Operator Overloading (not supported in Java but we can show it for
 * strings)
 * 
 * 2. Run Time Polymorphism->
 * types:-
 * a) Method Overriding
 * b) Dynamic Method Dispatch
 */

// a) method overloading
class Test {
    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of 2 double numbers: " + (a + b));
    }

}

// b) constructor overloading
class Test2 {
    Test2() {
        System.out.println("Default constructor is called");
    }

    Test2(int a) {
        System.out.println("Constructor with 1 parameter is called: " + a);
    }

    Test2(int a, int b) {
        System.out.println("Constructor with 2 parameters is called: " + (a + b));
    }
}

// c) operator overloading (not supported in Java but we can show it for
// strings)
class Test3 {
    int a, b;

    Test3(int a, int b) {
        this.a = a;
        this.b = b;

        int c = a + b;
        System.out.println("Sum of 2 numbers: " + c);
        System.out.println("Hello" + " World!");

        // “Java provides built-in support where the + operator works for both numeric
        // addition and string concatenation, but user-defined operator overloading is
        // not supported.”
    }
}
