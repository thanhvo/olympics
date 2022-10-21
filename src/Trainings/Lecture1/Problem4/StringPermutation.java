package Trainings.Lecture1.Problem4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {
    private static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length())
            return false;
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(new FileReader("permutation.inp"));
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        String answer = permutation(s, t) ? "YES" : "NO";
        PrintWriter outPrintWriter = new PrintWriter("permutation.out", "UTF-8");
        outPrintWriter.println(answer);
        outPrintWriter.close();
    }
}
