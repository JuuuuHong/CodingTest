package programmers;

import java.util.Scanner;

public class Solution120887 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int solution = solution(i, j, k);
        System.out.println(solution);
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;

        for(i = i; i <= j; i++) {
            String iString = String.valueOf(i);

            for(int a = 1; a <= iString.length(); a++) {
                if (iString.length() == 1) {
                    if (iString.equals(String.valueOf(k))) {
                        answer++;
                    }
                } else {
                    if (iString.substring(a - 1, a).equals(String.valueOf(k))) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}