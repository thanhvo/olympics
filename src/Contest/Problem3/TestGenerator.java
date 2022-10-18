package Contest.Problem3;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestGenerator {
    private static final Random RANDOM = new Random();

    private static Boolean unique(String s) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        final String[] INPUT = {
                "abcdef",
                "20abcdef45",
                "abcba",
                "abc%def",
                "1000",
                "dw3412",
                "qwert",
                "zxccv",
                "1000000",
                "zxcvbnmgfde123456@$%"
        };

        final int[] OUTPUT = {
                1,
                1,
                0,
                1,
                0,
                1,
                1,
                0,
                0,
                1
        };
        for(int i = 0; i < INPUT.length; i++) {
            try {
                String inFilePath =  new File("").getAbsolutePath();
                inFilePath = inFilePath.concat("/out/Contest.Problem3/" + i + "_in.txt");
                PrintWriter inPrintWriter = new PrintWriter(inFilePath, "UTF-8");
                inPrintWriter.println(INPUT[i]);
                inPrintWriter.close();
                String outFilePath = new File("").getAbsolutePath();
                outFilePath = outFilePath.concat("/out/Contest.Problem3/" + i + "_out.txt");
                PrintWriter outPrintWriter = new PrintWriter(outFilePath, "UTF-8");
                outPrintWriter.println(OUTPUT[i]);
                outPrintWriter.close();
            } catch (Exception ex) {
            }
        }
    }
}
