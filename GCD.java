import java.util.*;

public class GCD {
    int gcd(int a, int b) {
        // base case
        if (b == 0) {
            return a; // when b = 0, a is the required GCD
        }
        return gcd(b, a % b); // each time 'b' becomes 'a' and 'b' becomes the mod of previous (a, b) pair
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCD ob = new GCD();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Greatest Common Divisor of " + a + " and " + b + " = " + ob.gcd(a, b));

        sc.close();
    }
}
