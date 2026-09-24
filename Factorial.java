import java.util.*;

public class Factorial {

    int fact(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // The method recursively calculates the factorial of n.
        // It stops when n reaches 0, returning 1 as the base case.
        // Otherwise, it multiplies n with the factorial of n - 1.
        // The returned values combine to give n!
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial ob = new Factorial();

        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();

        System.out.print("Factorial: " + ob.fact(n));

        sc.close();
    }
}
