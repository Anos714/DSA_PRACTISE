
public class Homework {
    public static void main(String[] args) {
        // count consonant in a string
        String str = "Java is great untill you start development";
        String vowel = "aeiouAEIOU";
        int cons = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowel.indexOf(str.charAt(i)) == -1) {
                cons++;
            }

        }
        System.out.println("Count of consonants: " + cons);

        // convert string to uppercase without using method
        String str1 = "Java is great untill you start development";
        char[] strArr = new char[str1.length()];
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str.charAt(i);
            if (lower.indexOf(ch) != -1) {
                strArr[i] = upper.charAt(lower.indexOf(ch));
            } else {
                strArr[i] = str1.charAt(i);
            }
        }

        String newStrArr = new String(strArr);
        System.out.println(newStrArr);

        // find frequency of a character
        String str2 = str.toLowerCase();
        char charFreq = 'a';
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch == charFreq) {
                count++;
            }
        }
        System.out.println("Frequnecy of " + charFreq + " : " + count);

        // remove all spaces from string
        String str3 = str.trim();
        String arr[] = str3.split(" ");
        String newStr = "";

        for (String st : arr) {

            newStr += st;
        }

        System.out.println(newStr.toString());

        // check if string contains only digits
        String str4 = "123456";
        String digit = "1234567890";
        boolean allDigitStr = false;
        for (int i = 0; i < str4.length(); i++) {
            char ch = str4.charAt(i);
            if (digit.indexOf(ch) != -1) {
                allDigitStr = true;
            } else {
                allDigitStr = false;
            }
        }
        if (!allDigitStr) {
            System.out.println("this string is not all digits");
        } else {
            System.out.println("All digits string");
        }

        // count words in a sentence
        int countWords = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                countWords++;
            }
        }
        System.out.println("Total words in a sentence: " + countWords);

    }
}
