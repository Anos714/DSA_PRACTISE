
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
            for (int i = 3; i <= Math.sqrt(num); i++) {
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

    static int factorial(int num) {
        int ans = 1;
        while (num > 1) {
            ans *= num;
            num--;
        }
        return ans;
    }

    static int lengthOfNum(int num) {
        int len = 0;
        while (num > 0) {
            num = num / 10;
            len++;
        }
        return len;
    }

    static int isArmstrong(int num) {
        // part-1 find the length of given number
        int len = lengthOfNum(num);
        int digit;
        double sum = 0;

        while (num > 0) {
            digit = num % 10;

            sum = sum + Math.pow(digit, len);
            num = num / 10;

        }

        return (int) sum;

    }

    static int powerOfNum(int num, int pow) {
        int sum = 1;
        while (pow > 0) {
            sum = sum * num;
            pow--;
        }
        return sum;
    }

    static int perfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("divisor: " + i);
                sum = sum + i;
            }
        }
        return sum;
    }

    static boolean checkPrimeOrNot(int num) {
        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static void printPrimeNo(int num) {
        for (int i = 2; i <= num; i++) {
            boolean isPrime = checkPrimeOrNot(i);
            if (isPrime == true) {
                System.out.println(i + " is a prime no.");
            }
        }
    }

    static void countNumberEvendigit(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                System.out.println("even digit: " + digit);
                count++;
            }
            num /= 10;

        }
        System.out.println("Count of even digit in a number: " + count);
    }

    static void sieveAlgo(int num) {
        boolean isPrime[] = new boolean[num + 1];
        for (int i = 0; i <= num; i++) {
            if (i == 0 || i == 1) {
                isPrime[i] = false;
            } else {
                isPrime[i] = true;
            }

        }

        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j <= num; j = j + i) {
                    isPrime[j] = false;
                }
            }

        }

        for (int i = 0; i <= num; i++) {
            if (isPrime[i] == true) {
                System.out.println(i + " is prime no.");
            }
        }

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
        boolean isPrime = checkPrime(27);
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

        // factorial of a number
        System.out.println(factorial(5));

        // check no. is armstrong no. or not
        int num2 = 1634;
        if (isArmstrong(num2) == num2)
            System.out.println(num2 + " is armstrong no.");
        else
            System.out.println(num2 + " is not armstrong no.");

        // power of a number
        System.out.println(powerOfNum(12, 4));

        // find divisors or check perfect number
        int num3 = 28;
        if (perfectNumber(num3) == num3)
            System.out.println(num3 + " is perfect number");
        else
            System.out.println(num3 + " is not a perfect no.");

        // print all prime no. from 1 to n
        printPrimeNo(100);

        // Count how many digits in a number are even.
        countNumberEvendigit(52634);

        // sieve of eratosthenes algo for finding prime no.
        sieveAlgo(20);
    }
}