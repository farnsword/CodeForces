package CF_tasks;

import java.util.Scanner;

/**
 * Created by Oleksii on 30.09.2016.
 */
public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int s = (n * m) / 2;
        System.out.println(s);
    }
}
