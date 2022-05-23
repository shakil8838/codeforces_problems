package p1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; scan.hasNext() == true; i++) {
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
