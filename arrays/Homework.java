import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // linear search
        int arr[] = { 1, 23, 45, 55, 21 };
        boolean isFound = false;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println(target + " found at index " + i);
                isFound = true;
                break;
            }

        }
        if (!isFound) {
            System.out.println("element is not in the array");
        }

        /*
         * Binary Search Algorithm (Steps)
         * Array sorted होना चाहिए (ascending order)
         * low = 0, high = n - 1
         * जब तक low <= high:
         * mid = (low + high) / 2
         * अगर arr[mid] == target → element मिल गया
         * अगर target < arr[mid] → high = mid - 1
         * अगर target > arr[mid] → low = mid + 1
         * Loop खत्म हो जाए → element नहीं मिला
         */

        int arr1[] = { 1, 2, 3, 4, 5, 34, 80 };
        int low = 0, high = arr1.length - 1;
        int mid = 0;
        boolean isFounds = false;
        System.out.println("Enter an array element you want to find: ");
        int t = sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (low <= high) {
                mid = (low + high) / 2;
                if (arr1[mid] == target) {
                    System.out.println(target + " found at index " + i);
                    isFounds = true;
                    break;
                } else if (target < arr1[mid]) {
                    high = mid - 1;
                } else if (target > arr1[mid]) {
                    low = mid + 1;
                }

            }

        }

        if (!isFounds) {
            System.out.println("element is not in the array");
        }

        sc.close();

    }

}
