package Trainings.Lecture1.Problem3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Primes {
    public static ArrayList<Integer> generatePrimes(int n) {
        int size = (int)Math.floor(0.5 * (n - 3)) + 1;
        ArrayList<Integer> primes = new ArrayList();
        primes.add(2);
        // isPrime[i] represents (2i +3) is prime or not
        boolean[] isPrime = new boolean[size];
        Arrays.fill(isPrime, true);
        for (int i = 0; i < size; i++) {
            if (isPrime[i]) {
                int p = (i * 2) + 3;
                primes.add(p);
                for (int j = (i * i) * 2 + 6 * i + 3; j < size; j += p) {
                    isPrime[j] = false;
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(new FileReader("primes.inp"));
        int n = scanner.nextInt();
        ArrayList<Integer> primes = generatePrimes(n);
        PrintWriter outPrintWriter = new PrintWriter("primes.out", "UTF-8");
        for (int p : primes)
            outPrintWriter.println(p);
        outPrintWriter.close();
    }
}
