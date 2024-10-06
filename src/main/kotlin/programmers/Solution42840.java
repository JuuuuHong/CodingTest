package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution42840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answers = new int[]{sc.nextInt()};
        int[] solution = solution(answers);
        System.out.println(solution);
    }

    public static int[] solution(int[] answers) {
        int[] answer = new int[3];

        int[] a = new int[6];
        int aCount = 0;
        int[] b = new int[9];
        int bCount = 0;
        int[] c = new int[11];
        int cCount = 0;
        int[] count = new int[answers.length + 1];
        int max = 0;

        for (int i = 0; i < answers.length; i++) {
            if (a[i] == answer[i]) {
                aCount += 1;
                count[0] += 1;
            } else if (b[i] == answer[i]) {
                bCount += 1;
                count[1] += 1;
            } else if (c[i] == answer[i]) {
                cCount += 1;
                count[2] += 1;
            }
        }

        Arrays.sort(count);

        for (int i = 0; i < 3; i++) {
            if (count[i] == aCount) {
                answer[i] = 0;
            } else if (count[i] == bCount) {
                answer[i] = 1;
            } else if (count[i] == cCount) {
                answer[i] = 2;
            }
        }

        return answer;
    }
}