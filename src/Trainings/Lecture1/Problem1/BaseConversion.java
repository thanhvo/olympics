package Trainings.Lecture1.Problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class BaseConversion {

    private static final Random RANDOM = new Random();

    final static int[] SIZES = {1, 2, 3, 5, 10, 15, 16, 17, 18, 19};
    final static char[] CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final static int MAX_BASE = 16;

    private static int getInt(char c) {
        return Character.isDigit(c) ? (c - '0') : (c - 'A' + 10);
    }

    private static char getChar(long i) {
        return (i >= 10) ? (char)('A' + i-10) : (char)('0' + i);
    }

    private static String getRandomString(int base, int length) {
        StringBuffer sb = new StringBuffer();
        boolean neg = RANDOM.nextBoolean();
        if (neg) sb.append('-');
        for (int i = 0; i < length; i++) {
            int j = RANDOM.nextInt(base);
            sb.append(CHARS[j]);
        }
        return sb.toString();
    }

    private static String convertBase(int b1, String s, int b2) {
        boolean neg = s.charAt(0) == '-' ? true : false;
        long x = 0;
        for (int i = neg ? 1 : 0; i < s.length(); i++) {
            x *= b1;
            x += getInt(s.charAt(i));
        }
        StringBuffer ans = new StringBuffer();
        while (x > 0) {
            long r = x % b2;
            ans.append(getChar(r));
            x /= b2;
        }
        if (ans.isEmpty()) return "0";
        else {
            if (neg) ans.append('-');
            return ans.reverse().toString();
        }
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        for (int i = 0; i < SIZES.length; i++) {
            String inFilePath =  new File("").getAbsolutePath();
            inFilePath = inFilePath.concat("/out/Trainings/Lecture1/Problem1/" + i + "_in.txt");
            PrintWriter inPrintWriter = new PrintWriter(inFilePath, "UTF-8");
            int b1 = RANDOM.nextInt(MAX_BASE-1) + 2;
            inPrintWriter.println(b1);
            String s = getRandomString(b1,SIZES[i]);
            inPrintWriter.println(s);
            int b2 = RANDOM.nextInt(MAX_BASE-1) + 2;
            inPrintWriter.println(b2);
            String t = convertBase(b1,s,b2);
            inPrintWriter.close();
            String outFilePath = new File("").getAbsolutePath();
            outFilePath = outFilePath.concat("/out/Trainings/Lecture1/Problem1/" + i + "_out.txt");
            PrintWriter outPrintWriter = new PrintWriter(outFilePath, "UTF-8");
            outPrintWriter.println(t);
            outPrintWriter.close();
        }
    }
}
