package programmers;

import java.util.Scanner;

public class Solution181932 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String solution = solution(code);
        System.out.println(solution);
    }

    public static String solution(String code) {
        String answer = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if ("1".equals(String.valueOf(code.charAt((i))))) {
                    mode = 1;
                } else {
                    if (i % 2 ==0) {
                        answer = answer.concat(String.valueOf(code.charAt(i)));
                    }
                }
            } else {
                if ("1".equals(String.valueOf(code.charAt((i))))) {
                    mode = 0;
                } else {
                    if (i % 2 == 1) {
                        answer = answer.concat(String.valueOf(code.charAt(i)));
                    }
                }
            }
        }

        return answer;
    }
}