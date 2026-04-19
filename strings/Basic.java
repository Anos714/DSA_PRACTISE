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

    }
}
