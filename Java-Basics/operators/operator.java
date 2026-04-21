class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    
}



class Opeartor {
public static void main(String[] args) {
    System.out.println("Operators in Java:");
    System.out.println("Arithmetic Operators: +, -, *, /, %");

    int a=10;
    int b=21;

    int sum=a+b;
    int sub=b-a;
    int mult=a*b;
    int div=b/a;
    int mod=b%a;

    System.out.println("Addition: "+sum);
    System.out.println("Subtraction: "+sub);
    System.out.println("Multiplication: "+mult);
    System.out.println("Division: "+div);
    System.out.println("Modulus: "+mod);


    System.out.println("Relational Operators: ==, !=, >, <, >=, <=");
    System.out.println("Equal to: "+(a==b));
    System.out.println("Not equal to: "+(a!=b));
    System.out.println("Greater than: "+(a>b));
    System.out.println("Less than: "+(a<b));
    System.out.println("Greater than or equal to: "+(a>=b));
    System.out.println("Less than or equal to: "+(a<=b));


    System.out.println("Logical Operators: &&, ||, !");
    boolean x=true;
    boolean y=false;    
    System.out.println("Logical AND: "+(x && y));
    System.out.println("Logical OR: "+(x || y));
    System.out.println("Logical NOT: "+(!x));


    int c=100;
    System.out.println("Assignment Operators: =, +=, -=, *=, /=, %=, ++, --");
    System.out.println("Assignment: "+(c=50));
    System.out.println("Addition Assignment: "+(c+=10));
    System.out.println("Subtraction Assignment: "+(c-=5));
    System.out.println("Multiplication Assignment: "+(c*=2));
    System.out.println("Division Assignment: "+(c/=5));
    System.out.println("Modulus Assignment: "+(c%=3));


    int d=5;
    System.out.println("Unary Increment/Decrement Operators:+, -, ++, --, !");
    System.out.println("Unary Plus: "+(+d));
    System.out.println("Unary Minus: "+(-d));
    System.out.println("Increment: "+(d++));
    System.out.println("Decrement: "+(d--)); 
    System.out.println("Logical NOT: "+(!x));   

    // pre increment
    int e=10;
    System.out.println("Pre Increment: "+(++e)); // e is incremented before being used      

    //post increment
    int f=10;
    System.out.println("Post Increment: "+(f++)); // f is used before being incremented 
    System.out.println("Value of f after post increment: "+f); // f is now incremented after being used


    //pre decrement
    int g=10;
    System.out.println("Pre Decrement: "+(--g)); // g is decremented before being used  

    //post decrement
    int h=10;
    System.out.println("Post Decrement: "+(h--)); // h is used before being decremented
    System.out.println("Value of h after post decrement: "+h); // h is now decremented after being used


    System.out.println("Bitwise Operators: &, |, ^, ~, <<, >>, >>>");
    int i=5; // 0101 in binary
    int j=3; // 0011 in binary
    System.out.println("Bitwise AND: "+(i & j)); // 0001
    System.out.println("Bitwise OR: "+(i | j)); // 0111
    System.out.println("Bitwise XOR: "+(i ^ j)); // 0110        
    System.out.println("Bitwise NOT: "+(~i)); // 1010   
    System.out.println("Left Shift: "+(i << 1)); // 1010
    System.out.println("Right Shift: "+(i >> 1)); // 0010
    System.out.println("Unsigned Right Shift: "+(j >>> 1)); // 001

    System.out.println("Conditional (Ternary) Operator: ? :");
    int k=10;
    String result=(k>5) ? "Greater than 5" : "Less than or equal to 5";
    System.out.println("Ternary Operator Result: "+result); 


    //interface opeartor
        System.out.println("Interface Operators: instanceof");
        String str="Hello";
        System.out.println("Is str an instance of String? "+(str instanceof String));

        //class example
        Animal animal=new Dog();
        animal.sound(); // Output: Dog barks
        System.out.println("Is animal an instance of Dog? "+(animal instanceof Dog)); // true
        System.out.println("Is animal an instance of Animal? "+(animal instanceof Animal)); // true

}
}




