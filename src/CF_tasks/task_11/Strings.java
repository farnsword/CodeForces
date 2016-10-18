package CF_tasks.task_11;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        int f = 0, s = 0;
        for (int i = 0; i < first.length(); i++) {
            if (Character.toLowerCase(first.charAt(i)) > Character.toLowerCase(second.charAt(i))) {
                f += 1;
                break;
            } else if (Character.toLowerCase(first.charAt(i)) < Character.toLowerCase(second.charAt(i))) {
                s += 1;
                break;
            }
        }

        if (f == s) {
            System.out.println(0);
        } else if (f < s) {
            System.out.println(-1);
        } else if (f > s) {
            System.out.println(1);
        }
    }
}
