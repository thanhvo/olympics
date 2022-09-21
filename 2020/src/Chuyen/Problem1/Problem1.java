package Chuyen.Problem1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {
    private static long countPaintPoints(long left, long right) {
        long total = 0;
        for (long i = left; i <= right; i++) {
            total += paintPoints(i);
        }
        return total;
    }

    private static long paintPoints(long i) {
        int count = 0;
        while (i%2==0) {
            count++;
            i = i >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        final String FILE_IN = "problem1.inp";
        final String FILE_OUT = "problem1.out";
        try {
            Scanner scanner = new Scanner(new File(FILE_IN));
            long left = scanner.nextLong();
            long right = scanner.nextLong();
            PrintWriter printWriter = new PrintWriter(FILE_OUT, "UTF-8");
            long result = countPaintPoints(left, right);
            printWriter.println(result);
            printWriter.close();
        } catch (Exception ex) {}
    }
}
