package programmers;

import java.util.Scanner;

public class Solution131705 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String solution = solution(s);
        System.out.println(solution);
    }

    public static String solution(String s) {
        String answer = "";

        s = s.toUpperCase();

        boolean f = false;
        boolean l = false;

        if (" ".equals(s.charAt(0))) {
            f = true;
        }

        if (" ".equals(s.charAt(s.length() - 1))) {
            l = true;
        }

        String[] a = s.split(" ", -1);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                System.out.println(j);
                if (j % 2 == 1) {
                    answer = answer.concat(String.valueOf(Character.toLowerCase(a[i].charAt(j))));
                } else {
                    answer = answer.concat(String.valueOf(Character.toUpperCase(a[i].charAt(j))));
                }

                System.out.println(answer);
            }
            if (i != a.length - 1) {
                answer = answer.concat(" ");
            }
        }

        if (f) {
            answer = " ".concat(answer);
        }

        if (l) {
            answer = answer.concat(" ");
        }

        return answer;
    }
}