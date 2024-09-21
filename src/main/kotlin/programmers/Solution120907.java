package programmers;

import java.util.Scanner;

public class Solution120907 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] quiz = new String[]{sc.next()};
        String[] solution = solution(quiz);
        System.out.println(solution);
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] iQuiz = quiz[i].split(" ");

            int first = Integer.parseInt(iQuiz[0]);

            String operation = iQuiz[1];
            int second = Integer.parseInt(iQuiz[2]);
            int solve = Integer.parseInt(iQuiz[4]);

            int calcResult;
            if (operation.equals("+")) {
                calcResult = first + second;
            } else {
                calcResult = first - second;
            }

            if (calcResult == solve) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}