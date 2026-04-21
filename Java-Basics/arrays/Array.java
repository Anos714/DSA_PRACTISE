import java.util.Scanner;

public class Array {

    // array declaration
    // int arr[]; or int []arr;
    int arr[];
    // space allocation
    static int arr1[] = new int[5];

    // array intialization
    static int arr2[] = { 1, 23, 45 };

    public static void main(String[] args) {

        // accessing elements of an array
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("elements of arr2 at index " + i + ": " + arr2[i]);
        }

        // inserting elements in arr1
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter array element at index " + i + ": ");
            int num = sc.nextInt();
            arr1[i] = num;
        }

        // accessing elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("elements of arr1 at index " + i + ": " + arr1[i]);
        }

        // accessing array elements using for each loop
        for (int val : arr2) {
            System.out.println(val);
        } // output -> 1, 23, 45

        int arr3[] = { 10, 2, 68, 51, 50 };
        // sum of elements of an array(arr3)
        int sum = 0;
        for (int val : arr3) {
            System.out.println("sum = " + sum + " val = " + val);
            sum += val;
            System.out.println("sum value at each iteration: " + sum);

        }
        System.out.println("Sum: " + sum);

        // multiply of elements of an array(arr3)
        int mul = 1;
        for (int val : arr3) {
            System.out.println("mul = " + mul + " val = " + val);
            mul *= val;
            System.out.println("multiply value at each iteration: " + mul);
        }
        System.out.println("Multiply: " + mul);

        // maximum element of an array(arr3)
        int max = arr3[0];

        for (int i = 0; i < arr3.length; i++) {

            int arrEle = arr3[i];
            if (max < arrEle) {
                max = arrEle;
            }
        }
        System.out.println("Max element of arr3: " + max);

        // lowest element of array(arr3)
        int low = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            if (low > arr3[i]) {
                low = arr3[i];
            }
        }
        System.out.println("Lowest element of array: " + low);
    }
}
