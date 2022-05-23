package p12;

import java.util.Scanner;

// 977A
public class P12 {
    public static void main(String[] args) {

        Scanner mScanner = new Scanner(System.in);
        int n, k;

        n = mScanner.nextInt();
        k = mScanner.nextInt();
        int lastDigit = 0;

        for (int i = 0; i < k; ++i) {

            lastDigit = n % 10;

            if (lastDigit == 0) {
                n /= 10;
            } else {
                n -= 1;
            }
        }

        System.out.println(n);

    }
}
