package p14;

import java.util.Scanner;

// 734A
public class P14 {
    public static void main(String[] args) {

        Scanner mScanner = new Scanner(System.in);
        int numG = mScanner.nextInt();
        mScanner.nextLine();

        char[] theAry = mScanner.nextLine().toCharArray();
        int A = 0, D = 0;

        if (theAry.length <= 100000) {
            for (char theChar : theAry) {
                if (theChar == 'A') {
                    ++A;
                } else if (theChar == 'D') {
                    ++D;
                }
            }

            if (A > D) {
                System.out.println("Anton");
            } else if (A < D) {
                System.out.println("Danik");
            } else if (A == D) {
                System.out.println("Friendship");
            }
        }


    }
}
