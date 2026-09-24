import java.util.*;

public class Sum {
    int sum(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum ob = new Sum();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers: " + ob.sum(n));
        sc.close();
    }
}
