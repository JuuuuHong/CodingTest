package programmers;

import java.util.Scanner;

public class Solution120808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int denom1 = sc.nextInt();
        int number2 = sc.nextInt();
        int denom2 = sc.nextInt();
        int[] solution = solution(number1, denom1, number2, denom2);
        System.out.println(solution);
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int a = denom1 % denom2;
        int b = denom2 % a;
        int c = denom1 * denom2 / a;

        int d = denom1 / c;
        int e = denom2 / c;

        numer1 = numer1 * d;
        numer2 = numer2 * e;

        answer[0] = c;
        answer[1] = numer1 + numer2;

        return answer;
    }
}