
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

        // Run Time Polymorphism
        Animal a = new Dog();
        a.sound();// Output: Dog barks

        // Dynamic Method Dispatch
        Animal1 a1 = new Dog1(); // upcasting
        a1.sound();// Output: Dog barks
        Animal1 a2 = new Cat();
        a2.sound();// Output: Cat meows

        // Method Overriding with @Override annotation
        Parent1 p = new Parent1();
        p.display();// Output: Parent class display method is called

        Child1 c = new Child1();
        c.display();// Output: Child class display method is called
    }

    /*
     * What’s Really
     * 
     * Happening (Important)
     * 
     * Java uses dynamic method dispatch:
     * 
     * Compiler checks reference type → Animal
     * JVM checks actual object → Dog
     * Calls method of Dog
     * 
     * Decision happens at runtime, not compile time
     */

}
