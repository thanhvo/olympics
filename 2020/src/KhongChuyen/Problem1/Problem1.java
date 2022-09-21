package KhongChuyen.Problem1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {
    private static long findLostCow(long n, long S) {
        long total = 0;
        for (long i = 1; i <= n; i++) {
            total += i;
        }
        return total - S;
    }

    public static void main(String[] args) {
        final String FILE_IN = "cows.inp";
        final String FILE_OUT = "cows.out";
        try {
            Scanner scanner = new Scanner(new File(FILE_IN));
            long n = scanner.nextLong();
            long S = scanner.nextLong();
            PrintWriter printWriter = new PrintWriter(FILE_OUT, "UTF-8");
            long result = findLostCow(n, S);
            printWriter.println(result);
            printWriter.close();
        } catch (Exception ex) {

        }

    }
}
