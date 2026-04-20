
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

    // static void checkPalindrome(int num) {
    // int digit;
    // int ans = 0;

    // while (num > 0) {

    // digit = num % 10;
    // ans = ans * 10 + digit;
    // num /= 10;

    // }

    // if (givenNum == ans) {
    // System.out.println(num + " is palindrome no");
    // } else {
    // System.out.println(num + " is not palindrome no");
    // }

    // }

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
        // checkPalindrome(1221);

    }
}