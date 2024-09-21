package programmers;

import java.util.Scanner;

public class Solution120812 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[]{sc.nextInt()};
        int solution = solution(array);
        System.out.println(solution);
    }

    public static int solution(int[] array) {
        int answer = 0;
        int[] result = new int[1001];
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            result[array[i]]++;
        }
        
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                answer = i;
                max = result[i];
            } else if (result[i] == max) {
                answer = -1;
            }
        }

        return answer;
    }
}