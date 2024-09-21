package programmers;

import java.util.Scanner;

public class Solution120923 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = sc.nextInt();
        int[] solution = solution(num, total);
        System.out.println(solution);
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

        if (total % num == 0) {
            int minus = (total / num) - (num / 2);
            for (int i = 0; i < num; i++) {

                answer[i] = minus;
                minus++;
            }
        } else {
            int minus = (total / num) - 1;
            for (int i = 0; i < num; i++) {
                answer[i] = minus;
                minus++;
            }
        }

        return answer;
    }
}