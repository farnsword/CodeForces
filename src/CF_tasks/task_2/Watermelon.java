package CF_tasks;

import java.util.Scanner;

/**
 * Created by Oleksii on 29.09.2016.
 */
public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        boolean desicion = false;
        for (int i = 1; i < w; i++) {
            if (i % 2 == 0 && (w - i) % 2 == 0) {
                desicion = true;
                break;
            }
        }
        if (desicion) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
