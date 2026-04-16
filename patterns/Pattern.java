
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

        // pattern 4 (solid rhombus with spaces)
        int n = 5, k = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + k; j++) {
                if (j <= k) {
                    System.out.print("  ");

                } else {
                    System.out.print(" * ");

                }
            }
            System.out.println();
            k--;
        }

        // 2nd solution
        for (int i = 1; i <= n; i++) {
            // for each row -> spaces, stars

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // spaces
            for (int p = 1; p <= n; p++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        // pattern 5 (inverted solid right angle triangle)

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // pattern 6 (numbers right angle triangle)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        // pattern 6 (numbers inverted right angle triangle)

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        // pattern 7 (solid triangle with spaces)
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        // pattern 8 (solid inverted triangle with spaces)
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= (n * 2) - (2 * i) + 1; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

        // pattern 9 (hollow reactangle)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i > 1 && i < n) {
                    if (j == 1 || j == 6) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // pattern 10 (hollow right angle triangle)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i > 2 && i < n) {
                    if (j > 1 && j < i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // pattern 11 (hollow traingle with spaces)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i > 1 && i < n) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // pattern 12 (diamond shape pattern)
        int z = 4;
        // part-1
        for (int i = 1; i <= z; i++) {
            // spaces
            for (int j = 1; j <= z - i; j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // part-2
        for (int i = 1; i <= z; i++) {
            if (i == 1) {
                continue;
            }
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= 2 * z - 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        // pattern 13 (hollow diamond)
        // part-1
        for (int i = 1; i <= z; i++) {
            // space
            for (int j = 1; j <= z - i; j++) {
                System.out.print("  ");
            }
            // star

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i > 1 && i <= z) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();

        }

        // part-2
        for (int i = 1; i <= z; i++) {
            if (i == 1) {
                continue;
            }
            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= 2 * z - 2 * i + 1; j++) {
                if (j == 1 || j == 2 * z - 2 * i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
