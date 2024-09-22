package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution12906 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{sc.nextInt()};
        int[] solution = solution(arr);
        System.out.println(solution);
    }

    public static int[] solution(int[] arr) {
        ArrayList arrayList = new ArrayList<Integer>();
        int j = 1;

        arrayList.add(0, arr[0]);

        for (int i = 0; i < arr.length - 1; i++) {
            if (!arrayList.get(j - 1).equals(arr[i + 1])) {
                arrayList.add(j, arr[i + 1]);
                j++;
            }
        }

        int answer[] = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = (int) arrayList.get(i);
        }

        return answer;
    }
}