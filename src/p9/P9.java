package p9;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {

        int n, k;
        int[] a = new int[100];

        int pos = 0;

        Scanner mScanner = new Scanner(System.in);

        n = mScanner.nextInt();
        k = mScanner.nextInt();

        for (int i = 0; i < n && n < 50; ++i) {
            a[i] = mScanner.nextInt();
        }

        for (int i = k; i < a.length; ++i) {
            if (a[i] > 0) {
                if (a[i] <= a[k + 1]) {
                    pos = i;
                }
            }
        }
        System.out.println(pos);
    }
}

