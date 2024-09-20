package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution120869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] spell = new String[]{sc.next()};
        String[] dic = new String[]{sc.next()};
        int solution = solution(spell, dic);
        System.out.println(solution);
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean isTrue = false;

        for (int i = 0; i < dic.length; i++) {
            answer = 2;
            for (int k = 0; k < spell.length; k++) {
                if (dic[i].contains(spell[k])) {
                    isTrue = true;
                } else {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}