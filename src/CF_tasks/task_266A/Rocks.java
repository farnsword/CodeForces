//package CF_tasks.task_266A;

import java.util.Scanner;

public class Rocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String colors = sc.next();
        int counter = 0;
        for (int i = 1; i < number; i++) {
            if(colors.charAt(i-1) == colors.charAt(i)){
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
