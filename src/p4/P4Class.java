package p4;

import java.io.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P4Class {
    public static void main(String[] args) throws IOException {

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader
                .readLine()
                .replaceAll("\\s+$", "")
                .split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }*/
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.set(2021, 9, 24);
        Date mDate = mCalendar.getTime();
        Format f = new SimpleDateFormat("EEEE");
        System.out.println(f.format(mDate).toUpperCase());
    }
}

/*class Result {

 *//*
 * Complete the 'findDay' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER month
 *  2. INTEGER day
 *  3. INTEGER year
 *//*

    public static String findDay(int month, int day, int year) {
        Date mDate = new Date(year, month, day);

        switch (mDate.getDay()){

        }
    }

}*/
