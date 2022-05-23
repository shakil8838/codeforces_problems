package p8;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {

        Scanner mScanner = new Scanner(System.in);
        int m = mScanner.nextInt();
        int n = mScanner.nextInt();

        if (m >= 1 && n >= m && n <= 16) {
            int area = m * n;
            int res = area / 2;
            System.out.println(res);
        }
    }
}
