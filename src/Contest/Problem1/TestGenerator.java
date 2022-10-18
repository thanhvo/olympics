package Contest.Problem1;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TestGenerator {
    private static final Random RANDOM = new Random();
    private static Set<Integer> pickRandom(int n, int k) {
        final Set<Integer> picked = new HashSet<>();
        while (picked.size() < n) {
            picked.add(RANDOM.nextInt(2*k+1) - k);
        }
        return picked;
    }

    private static int minDiff(Set<Integer> set) {
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            int diff = Math.abs(list.get(i) - list.get(i-1));
            if (diff < min) min = diff;
        }
        return min;
    }

    public static void main(String[] args) {
        final int[] SIZES = {10, 20, 30, 50, 60, 70, 100, 1000, 10000, 100000};
        final int MAX = 1000000000;
        for(int i = 0; i < SIZES.length; i++) {
            try {
                String inFilePath =  new File("").getAbsolutePath();
                inFilePath = inFilePath.concat("/out/Contest.Problem1/" + i + "_in.txt");
                PrintWriter inPrintWriter = new PrintWriter(inFilePath, "UTF-8");
                inPrintWriter.println(SIZES[i]);
                Set<Integer> set = pickRandom(SIZES[i], MAX);
                for (int value : set) {
                    inPrintWriter.println(value);
                }
                inPrintWriter.close();
                String outFilePath = new File("").getAbsolutePath();
                outFilePath = outFilePath.concat("/out/Contest.Problem1/" + i + "_out.txt");
                PrintWriter outPrintWriter = new PrintWriter(outFilePath, "UTF-8");
                int result = minDiff(set);
                outPrintWriter.println(result);
                outPrintWriter.close();
            } catch (Exception ex) {
            }
        }
    }
}
