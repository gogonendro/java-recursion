import java.util.*;

public class ArraySum {
    int sum(int arr[], int i) {
        if (i == 0) {
            return arr[i];
        }
        return arr[i] + sum(arr, i - 1); // adds elements backwards
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArraySum ob = new ArraySum();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of elements: " + ob.sum(arr, n - 1));
        sc.close();
    }
}
