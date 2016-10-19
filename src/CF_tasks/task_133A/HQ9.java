package CF_tasks.task_133A;

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pr = sc.next();
        String r = "NO";
        for (int i = 0; i < pr.length(); i++) {
            if(pr.charAt(i) == 'H' ||
                    pr.charAt(i) == 'Q'||
                    pr.charAt(i) == '9'){
                r = "YES";
            }
        }
        System.out.println(r);
    }
}
