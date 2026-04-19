import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        // print each character of string
        String str1 = "Rahul Sain";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("String character at index " + i + ": " + str1.charAt(i));
        }

        // count length of string without .length()
        String str2 = "rahul Bhai";
        char[] ss = str2.toCharArray();
        int len = 0;
        for (char st : ss) {
            len++;
        }
        System.out.println("Length of String: " + len);

        // count vowels in a string
        String str3 = "rahul sain is god";
        int vowel = 0;
        for (int i = 0; i < str3.length(); i++) {
            char ch = str3.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowel++;
            }

        }
        System.out.println("Count of vowel: " + vowel);

        // reverse a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str4 = sc.nextLine();
        char[] charArr = str4.toCharArray();
        char[] arr = new char[charArr.length];
        int j = 0;
        for (int i = charArr.length - 1; i >= 0; i--) {
            arr[j] = charArr[i];
            j++;
        }
        String ji = new String(arr);

        System.out.println(ji);

        // palindrome or not a string
        if (str4.equalsIgnoreCase(ji)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();

    }

}
