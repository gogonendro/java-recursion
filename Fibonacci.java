import java.util.*;

public class Fibonacci {
    int fibo(int n) {
        // base case fibo(0)
        if (n == 0) {
            return 0;
        }

        // base case fibo(1)
        else if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci ob = new Fibonacci();

        System.out.print("Enter term number: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci term = " + ob.fibo(n));

        sc.close();
    }
}
