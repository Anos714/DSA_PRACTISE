import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String name = sc.nextLine();

        System.out.println("Your Name: " + name);

        int num1, num2, sum;
        System.out.println("Enter First No.: ");
        num1 = sc.nextInt();
        System.out.println("Enter Second No.: ");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("Sum of " + num1 + " " + "+" + " " + num2 + " " + "= " + sum);

        sc.close();

        /*
         * Essential Methods
         * Method Description
         * next() Reads the next complete token as a String.
         * nextLine() Reads an entire line of text until a newline character is found.
         * nextInt() Scans the next token as an integer.
         * nextDouble() Scans the next token as a double.
         * hasNext() Returns true if there is another token available to read.
         * close() Closes the scanner to release system resources.
         * 
         */

    }
}