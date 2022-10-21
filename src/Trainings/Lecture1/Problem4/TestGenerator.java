package Trainings.Lecture1.Problem4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

public class TestGenerator {
    private static final Random RANDOM = new Random();

    private static int MAX_LENGTH = 1000;

    private static int TEST_CASES = 10;


    static private String generate() {
        int n = RANDOM.nextInt(MAX_LENGTH) + 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            char c = (char)(RANDOM.nextInt(26) + 'a');
            int length = RANDOM.nextInt(20) + 1;
            for (int j = 0; j < length; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String permute(String str) {
        String perm= RANDOM.ints( 0, str.length())
                .distinct()
                .limit(str.length())
                .mapToObj(i->String.valueOf(str.charAt(i))).collect(Collectors.joining());
        return perm;
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        for (int i = 0; i < TEST_CASES; i++) {
            String inFilePath =  new File("").getAbsolutePath();
            inFilePath = inFilePath.concat("/out/Trainings/Lecture1/Problem4/" + i + "_in.txt");
            PrintWriter inPrintWriter = new PrintWriter(inFilePath, "UTF-8");
            String s = generate();
            inPrintWriter.println(s);
            StringBuilder sb = new StringBuilder(permute(s));
            sb.setCharAt(RANDOM.nextInt(s.length()), 'x');
            String t = sb.toString();
            if (i % 4 == 0) t = generate();
            if (i % 2 == 1) t = permute(s);
            inPrintWriter.println(t);
            inPrintWriter.close();
            String outFilePath = new File("").getAbsolutePath();
            outFilePath = outFilePath.concat("/out/Trainings/Lecture1/Problem4/" + i + "_out.txt");
            PrintWriter outPrintWriter = new PrintWriter(outFilePath, "UTF-8");
            String res = StringPermutation.permutation(s, t) ? "YES" : "NO";
            outPrintWriter.println(res);
            outPrintWriter.close();
        }
    }
}
