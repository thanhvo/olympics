package Contest.Problem2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class TestGenerator {
    private static final Random RANDOM = new Random();

    private static long sum(long N) {
        long sum = 0;
        for (long i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        final long[] NUMBERS = {10, 20, 30, 100, 1000, 40000, 100000, 200000, 1000000, 1000000000};
        final long MAX = 1000000000;
        for(int i = 0; i < NUMBERS.length; i++) {
            try {
                String inFilePath =  new File("").getAbsolutePath();
                inFilePath = inFilePath.concat("/out/Contest.Problem2/" + i + "_in.txt");
                PrintWriter inPrintWriter = new PrintWriter(inFilePath, "UTF-8");
                Long M = RANDOM.nextLong(NUMBERS[i]);
                Long S = sum(NUMBERS[i]) - M;
                inPrintWriter.println(NUMBERS[i] + " " + S);
                inPrintWriter.close();
                String outFilePath = new File("").getAbsolutePath();
                outFilePath = outFilePath.concat("/out/Contest.Problem2/" + i + "_out.txt");
                PrintWriter outPrintWriter = new PrintWriter(outFilePath, "UTF-8");
                outPrintWriter.println(M);
                outPrintWriter.close();
            } catch (Exception ex) {
            }
        }
    }
}
