package programmers;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class Solution42748 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[]{sc.nextInt()};
        int[][] commands = new int[][]{new int[]{sc.nextInt()}};
        int[] solution = solution(array, commands);
        System.out.println(solution);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        System.out.println(commands.length);

        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];

            List<Integer> subList = Arrays.stream(array, a - 1, b)
                    .boxed()
                    .collect(Collectors.toList());

            subList = subList.stream()
                    .sorted()
                    .collect(Collectors.toList());

            answer[i] = subList.get(c - 1);
        }

        return answer;
    }
}