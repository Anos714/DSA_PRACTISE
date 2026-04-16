public class Number {
    public static void main(String[] args) {
        // pattern 1
        int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" " + j);
        // }
        // System.out.println();
        // }

        // pattern 2
        // int count = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" " + count);
        // count++;
        // }
        // System.out.println();
        // }

        // pattern 3

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" " + (char) (64 + j));
        // }
        // System.out.println();
        // }

        // pattern 4
        // for (int i = n; i >= 1; i--) {
        // for (int j = 5; j >= i; j--) {
        // System.out.print(" " + (char) (64 + j));
        // }
        // System.out.println();
        // }

        // pattern 5
        int k = 5;
        // part-1
        for (int i = 1; i <= k; i++) {
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= 2 * (k - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // part-2
        for (int i = 1; i <= k; i++) {
            if (i == 1) {
                continue;
            } else {
                // space
                for (int j = 1; j <= k - i; j++) {
                    System.out.print("  ");
                }
                // star
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}
