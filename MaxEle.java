import java.util.*;

public class MaxEle {
    int max(int arr[], int i) {
        if (i == 0) {
            return arr[i];
        }
        int m = max(arr, i - 1); // stores the maximum element of the previous elements
        if (arr[i] > m) { // compares it with current element
            return arr[i]; // returns current element if its larger
        }
        return m; // otherwise return previous maximum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxEle ob = new MaxEle();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest element: " + ob.max(arr, n - 1));
        sc.close();
    }
}
