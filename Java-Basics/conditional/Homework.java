import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        int age;
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }

        // Q2
        int hindi, english, maths, science, sanskrit;
        System.out.println("Enter hindi marks: ");
        hindi = sc.nextInt();
        System.out.println("Enter english marks: ");
        english = sc.nextInt();
        System.out.println("Enter maths marks: ");
        maths = sc.nextInt();
        System.out.println("Enter science marks: ");
        science = sc.nextInt();
        System.out.println("Enter sanskrit  marks: ");
        sanskrit = sc.nextInt();

        float percentage = (hindi + english + maths + science + sanskrit) / 5;
        System.out.println("Your percentage: " + percentage);

        // Q3
        String lowercase;
        System.out.println("Enter a character in lowercase: ");
        lowercase = sc.next();
        System.out.println("Your characters uppercase version: " +
                lowercase.toUpperCase());

        // Q4
        String upper;
        System.out.println("Enter a character in upperacse: ");
        upper = sc.next();
        System.out.println("Your characters lowercase version: " +
                upper.toLowerCase());

        // Q5
        int h, e, m, sci, sa;
        System.out.println("Enter hindi marks: ");
        h = sc.nextInt();
        System.out.println("Enter english marks: ");
        e = sc.nextInt();
        System.out.println("Enter maths marks: ");
        m = sc.nextInt();
        System.out.println("Enter science marks: ");
        sci = sc.nextInt();
        System.out.println("Enter sanskrit  marks: ");
        sa = sc.nextInt();

        int min = h;
        if (e < min)
            min = e;
        if (m < min)
            min = m;
        if (sci < min)
            min = sci;
        if (sa < min)
            min = sa;

        float per = (float) (h + e + m + sci + sa - min) / 4;
        System.out.println("Your percentage: " + per);

        sc.close();

    }
}