public class Loops {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int j = 0; j <= 10; j++) {
            System.out.println("Rahul Sain");
        }

        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        // while loop
        int i = 1;
        while (i <= 10) {
            System.out.println("Rahul Sain: " + i);
            i++;
        }

        int j = 2;
        while (j <= 100) {
            System.out.println("Even no: " + j);
            j += 2;
        }

        // nested loops
        for (int l = 1; l <= 5; l++) {
            for (int m = 1; m <= l; m++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

        for (int l = 1; l <= 3; l++) {
            for (int m = 1; m <= 3; m++) {
                System.out.println("l= " + l + " " + "m= " + m);
            }
        }

        // break and continue keywords
        for (int l = 0; l < 10; l++) {
            if (l == 4) {
                break;
            }
            System.out.println(l);
        }

        for (int l = 0; l < 10; l++) {
            if (l == 4) {
                continue;
            }
            System.out.println(l);
        }

        // nested while loop
        int r = 1;
        while (r <= 3) {
            int s = 1;
            while (s <= 3) {
                System.out.println("r= " + r + " s=" + s);
                s++;
            }
            r++;
        }

        // do while loop
        int g = 1;
        do {
            System.out.println("g= " + g);
            g++;
        } while (g <= 10);

    }
}
