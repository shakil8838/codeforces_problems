package p10;

import java.util.Scanner;

// 281A
public class P10 {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        String input = mScanner.nextLine();

        if (input.length() <= 1000) {
            System.out.println(input.replaceFirst(String.valueOf(input.charAt(0)),
                    String.valueOf(input.toUpperCase().charAt(0))));
        }
    }
}
