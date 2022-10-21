package Trainings.Lecture1.Problem2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringEncoding {
    public static String encode(String s) {
        StringBuffer sb = new StringBuffer();
        char last = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == last) {
                count++;
            } else {
                sb.append(count);
                sb.append(last);
                last = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(last);
        return sb.toString();
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(new FileReader("encoding.inp"));
        String s = scanner.nextLine();
        String t = encode(s);
        PrintWriter outPrintWriter = new PrintWriter("encoding.out", "UTF-8");
        outPrintWriter.println(t);
        outPrintWriter.close();
    }
}
