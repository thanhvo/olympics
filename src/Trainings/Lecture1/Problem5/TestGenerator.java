package Trainings.Lecture1.Problem5;

import Trainings.Lecture1.Problem4.StringPermutation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class TestGenerator {
    private static final Random RANDOM = new Random();

    private static final int TEST_CASES = 10;

    private static final int MAX = 1000000000;

    private static final int[] SIZES = { 10, 20, 30, 40, 50, 100, 1000, 10000, 50000, 100000};

    private static int generate() {
        int n = RANDOM.nextInt(MAX) + 1;
        return n;
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        for (int i = 0; i < TEST_CASES; i++) {
            String inFilePath =  new File("").getAbsolutePath();
            inFilePath = inFilePath.concat("/out/Trainings/Lecture1/Problem5/" + i + "_in.txt");
            PrintWriter inPrintWriter = new PrintWriter(inFilePath, "UTF-8");
            int N = SIZES[i];
            int[] heights = new int[N];
            inPrintWriter.println(N);
            for (int j = 0; j < N; j++) {
                inPrintWriter.print(generate() + " ");
                inPrintWriter.print(generate() + " ");
                int height = generate();
                heights[j] = height;
                inPrintWriter.println(height);
            }
            inPrintWriter.close();
            String outFilePath = new File("").getAbsolutePath();
            outFilePath = outFilePath.concat("/out/Trainings/Lecture1/Problem5/" + i + "_out.txt");
            PrintWriter outPrintWriter = new PrintWriter(outFilePath, "UTF-8");
            int capacity = RobotTraversal.findBaterryCapacity(heights);
            outPrintWriter.println(capacity);
            outPrintWriter.close();
        }
    }
}
