import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        // creation of string
        String name = "Rahul";
        String firstName = new String("Bahu");
        // printing string
        System.out.println(name);
        System.out.println(firstName);
        // printing single character from the string
        // System.out.println(name[0]);
        // System.out.println(firstName[0]);
        // we cannot do that it gives error, instead we do this
        System.out.println(name.charAt(0));
        // printing each character of string
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // methods of string
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.concat(firstName));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // string refrence shifting
        String day = "Sun";
        System.out.println(day);
        day = "Mon";
        System.out.println(day);

        // String vs StringBuilder vs StringBuffer
        // 1. String- immutable, heavy for concatenation
        String str = "Hello";
        str += " World";
        str += "!";
        System.out.println(str);

        // 2. StringBuilder- mutable, not heavy for concatenation
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.append("!");
        System.out.println(sb.toString());
        sb.insert(1, "r");
        System.out.println(sb);
        sb.replace(0, 3, "Jain");
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        // 3. StringBuffer
        StringBuffer sf = new StringBuffer("Hello");
        System.out.println(sf);

        // Comparing String
        String str1 = "Rahul";
        String str2 = "Rahul";
        String str3 = "rahul";
        // 1. == -> it only checks refrence in string pool
        System.out.println(str1 == str2);

        // 2. .equals() -> it check actual content but also case sensitive
        System.out.println(str1.equals(str2));

        // 3. .equalsIgnoreCase()- it ignores that string are in lowercase or uppercase
        System.out.println(str1.equalsIgnoreCase(str3));

        // String input
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter content of str4: ");
        // String str4 = sc.next();
        // System.out.println("Enter content of str5: ");
        // System.out.println("str4: " + str4);

        // String str5 = sc.nextLine();
        // System.out.println("str5: " + str5);
        // sc.close();

        // String methods

        String str6 = "My name is Rahul Sain";

        // 1. .length()
        System.out.println(str6.length());

        // 2. .charAt()
        System.out.println(str6.charAt(0));

        // 3. .substring()
        System.out.println(str6.substring(1, 7));

        // 4. .contains()
        System.out.println(str6.contains("name"));

        // 5. .equals()
        System.out.println(str6.equals(str));

        // 6.equalsIgnoreCase()
        System.out.println(str6.equalsIgnoreCase(str));

        // 7. .toUpperCase()
        System.out.println(str6.toUpperCase());

        // 8. .toLowerCase()
        System.out.println(str6.toLowerCase());

        // 9. .trim()
        System.out.println(str6.trim());

        // 10. .split() -> splits based on spaces,commas etc.
        String str7[] = str6.split(" ");
        for (String st : str7) {
            System.out.println("String: " + st);
        }

        // 11. .startsWith()
        System.out.println(str6.startsWith("M"));

        // 12. endsWith()
        System.out.println(str6.endsWith("J"));

        // 13. .valueOf() -> converts non string data to string
        System.out.println(str6.valueOf(1200));

        // 14. .isBlank() -> checks length=0 and if string have only spaces then gives
        // true
        System.out.println(str6.isBlank());

        // 15. .replace()
        System.out.println(str6.replace("name", "mane"));

        // 16. .toCharArray()
        System.out.println(str6.toCharArray());

        // 17. .isEmpty() -> checks only length=0 if found empty spaces then gives false
        System.out.println(str6.isEmpty());
    }
}
