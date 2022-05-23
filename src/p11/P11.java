package p11;

import java.util.Scanner;

// 59A
public class P11 {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);

        int numOfUp = 0;
        char[] input = mScanner.nextLine().toCharArray();

        for (char alp : input) {
            if (isUppercase(alp)) {
                ++numOfUp;
            }
        }

        if (numOfUp > (input.length / 2)) {
            System.out.println(String.valueOf(input).toUpperCase());
        } else {
            System.out.println(String.valueOf(input).toLowerCase());
        }

    }

    private static boolean isUppercase(char letter) {
        return Character.isUpperCase(letter);
    }
}
