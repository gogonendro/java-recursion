import java.util.*;

public class SumDigit {
    int sum(int n) {
        // base case
        if (n <= 9) {
            return n;
        }
        // recursive case
        return (n % 10) + sum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumDigit ob = new SumDigit();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The sum of digits of " + n + " = " + ob.sum(n));

        sc.close();
    }
}
