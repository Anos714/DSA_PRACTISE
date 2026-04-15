import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1
        int n;
        System.out.println("Enter a no: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Q2
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        // Q3
        for (int i = 1; i <= n; i++) {
            System.out.println(i * 10);
        }

        // Q4
        for (int i = 1; i <= 100; i++) {
            System.out.println("Rahul Sain: " + i);
        }

        // Q5
        boolean isBool = true;
        for (int i = 2; i <= 200; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == 2) {
                    System.out.println("Prime no: 2");
                    break;
                }
                if (i == j) {
                    continue;
                } else if (i % j == 0) {
                    isBool = false;
                    break;
                } else if (i % j != 0) {
                    isBool = true;
                }
            }
            if (isBool) {
                System.out.println("Prime no: " + i);
            }
        }

        // Q6
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        // Q7
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Q8
        for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
