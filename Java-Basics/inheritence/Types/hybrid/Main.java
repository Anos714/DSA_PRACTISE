class A {
    int a;

    A() {
        System.out.println("Constructor of A is called");
    }

    void displayA() {
        System.out.println("Value of a: " + a);
    }
}

interface B {
    void show();
}

interface C {
    void display();
}

class D extends A implements B, C {

    int b;

    public void show() {
        System.out.println("Implementing show method from interface B");
    }

    public void display() {
        System.out.println("Implementing display method from interface C");
    }

    D() {
        System.out.println("Constructor of D is called");
    }

    void displayD() {
        super.displayA();
        System.out.println("Value of b: " + b);
    }

}

class Main {
    public static void main(String[] args) {
        D d = new D();
        d.a = 10;
        d.b = 20;

        d.displayD();
        d.show();
        d.display();
    }
}