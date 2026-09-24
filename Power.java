import java.util.*;

public class Power {
    int expo(int b, int p) {
        // base case
        if (p == 0) {
            return 1;
        }
        return b * expo(b, p - 1); // b is multiplied with itself till p = 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Power ob = new Power();

        System.out.print("Enter the base number: ");
        int b = sc.nextInt();
        System.out.print("Enter the power: ");
        int p = sc.nextInt();
        System.out.println(b + " raised to the power of " + p + " = " + ob.expo(b, p));

        sc.close();
    }
}
