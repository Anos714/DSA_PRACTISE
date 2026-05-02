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

//1. Compile Time Polymorphism
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

// 2. Run Time Polymorphism
// a) method overriding
class Parent {
    int a = 10;

    Parent() {
        System.out.println("Parent class constructor is called");
    }

    void display() {
        System.out.println("Parent class display method is called");
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() { // overriding
        System.out.println("Dog barks");
    }
}

// b) dynamic method dispatch
class Animal1 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal1 {
    void sound() {
        System.out.println("Cat meows");
    }
}

// example
class Boss {
    void work() {
        System.out.println("Boss is working");
    }
}

class Developer extends Boss {
    void work() {
        System.out.println("Developer is working");
    }
}

class Designer extends Boss {
    void work() {
        System.out.println("Designer is working");
    }
}

// method overriding by @override annotation
class Parent1 {
    void display() {
        System.out.println("Parent class display method is called");
    }
}

class Child1 extends Parent1 {
    // @Override
    void display() {
        System.out.println("Child class display method is called");
    }

    /*
     * What is @Override in Java?
     * 
     * @Override is an annotation that tells the compiler:
     * 
     * “This method is supposed to override a method from the parent class or
     * interface.”
     * 
     */
}