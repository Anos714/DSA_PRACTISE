
public class Pattern {
    public static void main(String[] args) {
        // pattern 1 (solid rectangular pattern)
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // pattern 2 (hollow square pattern)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    System.out.print(" * ");

                } else if (i > 1 && i < 5) {
                    if (j == 1 || j == 5) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }

        // pattern 3 (solid right angle triangle)

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        // pattern 4 ()

    }
}
