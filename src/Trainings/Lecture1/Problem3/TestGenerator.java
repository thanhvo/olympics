package Trainings.Lecture1.Problem3;

import Trainings.Lecture1.Problem2.StringEncoding;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

public class TestGenerator {
    private static final Random RANDOM = new Random();

    private static int TEST_CASES = 10;

    private static int MAX = 10000;

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        for (int i = 0; i < TEST_CASES; i++) {
            String inFilePath =  new File("").getAbsolutePath();
            inFilePath = inFilePath.concat("/out/Trainings/Lecture1/Problem3/" + i + "_in.txt");
            PrintWriter inPrintWriter = new PrintWriter(inFilePath, "UTF-8");
            int n = RANDOM.nextInt(MAX) + 1;
            inPrintWriter.println(n);
            inPrintWriter.close();
            ArrayList<Integer> primes = Primes.generatePrimes(n);
            String outFilePath = new File("").getAbsolutePath();
            outFilePath = outFilePath.concat("/out/Trainings/Lecture1/Problem3/" + i + "_out.txt");
            PrintWriter outPrintWriter = new PrintWriter(outFilePath, "UTF-8");
            for (int p : primes)
                outPrintWriter.println(p);
            outPrintWriter.close();
        }
    }
}
