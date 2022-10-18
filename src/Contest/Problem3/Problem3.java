package Contest.Problem3;

import java.util.*;

public class Problem3 {
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
