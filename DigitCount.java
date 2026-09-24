import java.util.*;

public class DigitCount {
    int count(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DigitCount ob = new DigitCount();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of Digits: " + ob.count(n));
        sc.close();
    }
}