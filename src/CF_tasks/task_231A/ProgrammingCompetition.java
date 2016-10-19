package CF_tasks;//package exercisesPackage.training;

import java.util.Scanner;

/**
 * Created by Oleksii on 03.10.2016.
 */
public class ProgrammingCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] s = new int[n][3];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                    s[i][j] = sc.nextInt();
            }
            if (s[i][0] == 1 && s[i][0] == s[i][1] ||
                    s[i][1] == 1 && s[i][1] == s[i][2] ||
                    s[i][0] == 1 && s[i][0] == s[i][2]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
