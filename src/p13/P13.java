package p13;

import java.util.Scanner;

// 41A
public class P13 {

    public static void main(String[] args) {

        Scanner mScanner = new Scanner(System.in);
        String s, t;

        s = new StringBuilder(mScanner.nextLine()).reverse().toString();
        t = mScanner.nextLine();

        if (s.length() < 100) {
            if (s.equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
