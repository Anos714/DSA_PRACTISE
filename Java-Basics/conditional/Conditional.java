import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        // if statement
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        }
        if (age < 18) {
            System.out.println("You cannot vote");
        }

        // if else statement
        int num1 = 18;
        int num2 = 20;
        if (num1 == num2) {
            System.out.println(num1 + " " + "and " + num2 + " " + "are equal");
        } else {
            System.out.println("Both are not equal");
        }

        // if else if statement
        int firstNum = 12;
        int secondNum = 14;
        if (firstNum > secondNum) {
            System.out.println("First number is greater");
        } else if (firstNum < secondNum) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both are equal");
        }

        // nested if else
        int a, b, c;
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        System.out.println("Enter value of c: ");
        c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is bigger tha n b and c");
            } else {
                System.out.println("c is bigger tha n a and b");
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("b is bigger tha n a and c");
            } else {
                System.out.println("c is bigger tha n a and b");
            }
        } else {
            System.out.println("c is bigger tha n a and b");
        }

        // ternery operator
        System.out.println((age >= 18) ? "You can vote" : "You cannot vote");
        ;

        boolean check = a > 10 ? true : false;
        System.out.println(check);

        // switch statement
        int day;
        System.out.println("Enter the day(from 1 to 7): ");
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter the number in the range 1 to 7");

        }

        sc.close();

    }
}
