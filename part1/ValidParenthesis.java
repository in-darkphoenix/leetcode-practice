package part1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(isValid(s));
        scn.close();

    }

    public static boolean isValid(String s) {
        int l = s.length();

        if (l % 2 != 0)
            return false;

        Deque<Character> p = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case '{':
                    p.push('}');
                    break;

                case '(':
                    p.push(')');
                    break;

                case '[':
                    p.push(']');
                    break;

                default:
                    if (p.isEmpty() || p.pop() != ch)
                        return false;
            }
        }
        
        return p.isEmpty();
    }
}
