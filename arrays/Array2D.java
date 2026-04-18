import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        // declaration of 2d array
        int matrix[][];
        // space allocation
        int arr1[][] = new int[3][3];
        // initialization
        int arr2[][] = { { 1, 2, 3 }, { 10, 20, 30 }, { 11, 12, 13 } };

        // the column length here works only when all columns of 2d array have same
        // elements

        // accessing each element of an array
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.println("Array elements at index " + "[ " + i + " ]" + " [" + j + " ]: " + arr2[i][j]);
            }
        }

        // for a jagged 2d array we use this method to find column length

        System.out.println("jagged 2d array starts here");
        int arr3[][] = { { 1, 2, 3 }, { 10, 20, 30, 40, 50 }, { 51, 52 }, { 71 } };
        for (int i = 0; i < arr3.length; i++) {
            int colLen = arr3[i].length;
            for (int j = 0; j < colLen; j++) {
                System.out.println("Array elements at index " + "[ " + i + " ]" + " [" + j + " ]: " + arr3[i][j]);
            }
        }

        // jagged array initialization(space allocation)
        // it tells rows
        int jagged[][] = new int[4][];
        // it tells each row's columns
        jagged[0] = new int[2];
        jagged[1] = new int[5];
        jagged[2] = new int[10];
        jagged[3] = new int[1];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.println("Enter Array elements at index " + "[ " + i + " ]" + " [" + j + " ]: ");
                jagged[i][j] = sc.nextInt();
            }
        }

        // traverse jagged array

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");

            }
            System.out.println();
        }
    }
}
