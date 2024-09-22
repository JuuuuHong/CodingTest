package programmers;

import java.util.Scanner;

public class Solution120924 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] common = new int[]{sc.nextInt()};
        int solution = solution(common);
        System.out.println(solution);
    }

    public static int solution(int[] common) {
        int answer = 0;
        int a = 0;
        int b = 0;

        a = common[1] - common[0];
        b = common[1] / common[0];
        if (common[2] - common[1] == a) {
            answer = common[common.length - 1] + a;
        } else {
            answer = common[common.length - 1] * b;
        }

        return answer;
    }
}