package programmers;

import java.util.Scanner;

public class Solution120894 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.next();
        long solution = solution(numbers);
        System.out.println(solution);
    }

    public static long solution(String numbers) {
        long answer = 0;
        String a = "";
        String b = "";

        for (int i = 0; i < numbers.length(); i++) {
            a = a + numbers.charAt(i);

            switch (a) {
                case "zero": b = b + "0"; a = ""; break;
                case "one": b = b + "1"; a = ""; break;
                case "two": b = b + "2"; a = ""; break;
                case "three": b = b + "3"; a = ""; break;
                case "four": b = b + "4"; a = ""; break;
                case "five": b = b + "5"; a = ""; break;
                case "six": b = b + "6"; a = ""; break;
                case "seven": b = b + "7"; a = ""; break;
                case "eight": b = b + "8"; a = ""; break;
                case "nine": b = b + "9"; a = ""; break;
                default: continue;
            }
        }

        answer = Long.valueOf(b);

        return answer;
    }
}