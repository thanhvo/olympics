package Trainings.Lecture1.Problem5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class RobotTraversal {
    public static int findBaterryCapacity(int[] heights) {
        int minHeight = Integer.MAX_VALUE;
        int capacity = 0;
        for (int height : heights) {
            capacity = Math.max(capacity, height - minHeight);
            minHeight = Math.min(height, minHeight);
        }
        return capacity;
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(new FileReader("robot.inp"));
        int N = scanner.nextInt();
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            scanner.nextInt();
            scanner.nextInt();
            heights[i] = scanner.nextInt();
        }
        int capacity = findBaterryCapacity(heights);
        PrintWriter outPrintWriter = new PrintWriter("robot.out", "UTF-8");
        outPrintWriter.println(capacity);
        outPrintWriter.close();
    }
}
