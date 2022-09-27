package Problem1;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
            picked.add(RANDOM.nextInt(k + 1));
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
        final int[] SIZES = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        final int MAX = 1000000000;
        for(int i = 0; i < SIZES.length; i++) {
            try {
                String inFileName = i + "_in.txt";
                PrintWriter inPrintWriter = new PrintWriter(inFileName, "UTF-8");
                inPrintWriter.println(SIZES[i]);
                Set<Integer> set = pickRandom(SIZES[i], MAX);
                for (int value : set) {
                    inPrintWriter.println(value);
                }
                inPrintWriter.close();
                String outFileName = i + "_out.txt";
                PrintWriter outPrintWriter = new PrintWriter(outFileName, "UTF-8");
                int result = minDiff(set);
                outPrintWriter.println(result);
                outPrintWriter.close();
            } catch (Exception ex) {
            }
        }
    }
}
