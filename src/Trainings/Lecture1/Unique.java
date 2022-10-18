package Trainings.Lecture1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique {
    private static Boolean unique(String s) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (unique(s)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
