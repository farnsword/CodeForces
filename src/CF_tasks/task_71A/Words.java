package CF_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Oleksii on 29.09.2016.
 */
public class Words {
    public static void main(String[] args) {
        int counter = 0;
        List<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        counter = sc.nextInt();

        for (int i = 0; i < counter; i++){
            words.add(sc.next());
        }

        for (String w: words) {
            if(w.length()>10){
                System.out.print(w.charAt(0));
                System.out.print(w.length()-2);
                System.out.println(w.charAt(w.length()-1));
            } else {
                System.out.println(w);
            }
        }
    }
}
