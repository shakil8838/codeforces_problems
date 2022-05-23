package pktc;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Scanner;

public class Pktc implements OnTestInterface {

    public void inverse(int num) {

    }

    public static void main(String[] args) {

        //OnTestInterface onTestInterface = new Pktc();

        /*int[] ary = {20, 10, 5, 45, 90, 90, 47, 90};

        for (int i = 0; i < ary.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (ary[i] < ary[j]) {
                    int temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }
        //5 10 20 45 47 90 90 90

        for (int i = ary.length - 1; i >= 0; --i) {
            if (ary[i] < ary[ary.length - 1]) {
//                System.out.println(ary[i]);
                onTestInterface.showTheText("" + ary[i]);
                break;
            }
        }*/

        // -1093864820
        // -628977416
        /*String encryprion = "AAAAsdfdklgoirnnmnv-f1gfdg4df56g46dfg4d3fg4df564g6$gfd3g5d48888g64";
        System.out.println("Encrypted-> " + encryprion);
        System.out.println("Encrypted-> " + encryprion.hashCode());*/

        //Date mDate = new Date(0, 0, 0, 3, 0);

        int t;
        Scanner mScanner = new Scanner(System.in);
        t = mScanner.nextInt();

        for (int i = 0; i < t; ++i) {
            int num = mScanner.nextInt();
            /*String tNumber = String.valueOf(num);

            int res1 = Integer.parseInt(String.valueOf(tNumber.charAt(0))) +
                    Integer.parseInt(String.valueOf(tNumber.charAt(1))) +
                    Integer.parseInt(String.valueOf(tNumber.charAt(2)));


            int res2 = Integer.parseInt(String.valueOf(tNumber.charAt(3))) +
                    Integer.parseInt(String.valueOf(tNumber.charAt(4))) +
                    Integer.parseInt(String.valueOf(tNumber.charAt(5)));

            if (res1 == res2)
                System.out.println("YES");
            else
                System.out.println("NO");*/

            System.out.println(num % 10);
        }
    }

    @Override
    public void showTheText(String message) {
        System.out.println(message);
    }
}
