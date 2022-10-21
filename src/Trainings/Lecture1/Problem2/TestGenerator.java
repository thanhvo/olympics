package Trainings.Lecture1.Problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class TestGenerator {
    private static final Random RANDOM = new Random();

    private static int TEST_CASES = 10;
    private static int MAX = 1000;

    static private String getRandomString(int n) {
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

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        for (int i = 0; i < TEST_CASES; i++) {
            String inFilePath =  new File("").getAbsolutePath();
            inFilePath = inFilePath.concat("/out/Trainings/Lecture1/Problem2/" + i + "_in.txt");
            PrintWriter inPrintWriter = new PrintWriter(inFilePath, "UTF-8");
            int n = RANDOM.nextInt(1000) + 1;
            String s = getRandomString(n);
            inPrintWriter.println(s);
            inPrintWriter.close();
            String t = StringEncoding.encode(s);
            String outFilePath = new File("").getAbsolutePath();
            outFilePath = outFilePath.concat("/out/Trainings/Lecture1/Problem2/" + i + "_out.txt");
            PrintWriter outPrintWriter = new PrintWriter(outFilePath, "UTF-8");
            outPrintWriter.println(t);
            outPrintWriter.close();
        }
    }
}
