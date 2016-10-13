package CF_tasks;

import java.util.Scanner;

/**
 * Created by Oleksii on 29.09.2016.
 */
public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(a[i] == 0){
                break;
            } else if(a[i] >= a[k-1]){
                result += 1;
            }
        }

        System.out.println(result);

    }
}
