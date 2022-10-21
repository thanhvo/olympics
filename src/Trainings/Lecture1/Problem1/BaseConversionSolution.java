package Trainings.Lecture1.Problem1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class BaseConversionSolution {

    private static int getInt(char c) {
        return Character.isDigit(c) ? (c - '0') : (c - 'A' + 10);
    }

    private static char getChar(long i) {
        return (i >= 10) ? (char)('A' + i-10) : (char)('0' + i);
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
        Scanner scanner = new Scanner(new FileReader("base.inp"));
        int b1 = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int b2 = scanner.nextInt();
        String t = convertBase(b1, s, b2);
        PrintWriter outPrintWriter = new PrintWriter("base.out", "UTF-8");
        outPrintWriter.println(t);
        outPrintWriter.close();
    }
}
