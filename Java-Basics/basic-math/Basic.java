
public class Basic {
    static void countDigit(int num) {
        int count = 0;
        while (num > 0) {

            if (num % 10 != 0) {
                count++;
            }
            num /= 10;
        }
        System.out.println("Count of digits of a no: " + count);

    }

    static void sumOfDigits(int num) {
        int digit;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;

        }
        System.out.println("Sum of digits of a number: " + sum);
    }

    static void reverseNum(int num) {
        int digit;
        int ans = 0;

        while (num > 0) {

            digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;

        }
        System.out.println("Reverse of a num: " + ans);

    }

    static int checkPalindrome(int num) {
        int digit;
        int ans = 0;

        while (num > 0) {
            digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }

        return ans;

    }

    static boolean checkPrime(int num) {
        boolean isPrime = false;
        if (num < 2) {
            isPrime = false;
        } else if (num == 2) {
            isPrime = true;
        } else {
            for (int i = 3; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
        }

        return isPrime;
    }

    static void checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even no.");
        } else
            System.out.println(num + " is odd no.");
    }

    static int gcd(int a, int b) {

        // Euclid's algorithm
        // gcd(a,b) = gcd(b,a%b)

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        // formula => lcm * hcf = a * b
        // lcm = (a*b)/hcf

        int hcf = gcd(a, b);
        int ans = (a * b) / hcf;

        return ans;
    }

    public static void main(String[] args) {
        // print digits of a number
        int num = 12345;
        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;
        }

        // count all digits of a number
        countDigit(315456734);

        // sum of digits of a number
        sumOfDigits(223452);

        // reverse a number
        reverseNum(1234);

        // check no is plaindrome or not
        int num1 = 1221;
        int result = checkPalindrome(num1);
        if (num1 == result) {
            System.out.println(num1 + " is palindrome");

        } else {
            System.out.println(num1 + " is not palindrome");
        }

        // check a number is prime or not
        boolean isPrime = checkPrime(42);
        if (!isPrime)
            System.out.println("Not prime no.");
        else
            System.out.println("Prime no.");

        // check no. is even or odd
        checkEvenOrOdd(15);

        // find gcd of numbers
        System.out.println(gcd(12, 15));

        // find lcm of a number
        System.out.println(lcm(12, 15));

    }
}