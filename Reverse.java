import java.util.*;

public class Reverse {
    // base case, stops recursion when number becomes single digit
    int rev(int n) {
        if (n < 10) {
            return n;
        }
        int l = String.valueOf(n).length(); // number of digits
        /*
         * eg. 1234
         * step 1: take out 4
         * step 2: multiply 4 with 10^(l-1) = 4*1000 = 4000
         * step 3: add rev(n/10) = rev(123) which repeats until n becomes 1
         */
        return (n % 10) * (int) Math.pow(10, l - 1) + rev(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverse ob = new Reverse();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Reverse of " + n + " = " + ob.rev(n));

        sc.close();
    }
}
