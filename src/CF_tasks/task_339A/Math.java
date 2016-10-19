package CF_tasks.task_339A;

import java.util.Arrays;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String row = sc.next();
        String cache = "";
        String result = "";
        int[] temp;

        for (int i = 0; i < row.length(); i += 2) {
            cache += row.charAt(i) + " ";
        }

        temp = Arrays.stream(cache.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] > temp[j]) {
                    int t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (result == "") {
                result += temp[i];
            } else {
                result += "+" + temp[i];
            }
        }
        System.out.println(result);
    }
}
