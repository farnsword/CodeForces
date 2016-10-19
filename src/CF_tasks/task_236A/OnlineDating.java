//package CF_tasks.task_236A;

import java.util.HashSet;
import java.util.Scanner;

public class OnlineDating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = sc.next();
        HashSet<Character> unique = new HashSet<Character>();
        for (int i = 0; i < login.length(); i++) {
            unique.add(login.charAt(i));
        }
        if(unique.size()%2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}