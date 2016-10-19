package CF_tasks.task_96A;

import java.util.Scanner;


public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int mark = 0;
        String ans = "";
        for (int i = 1; i < st.length(); i++) {
            if(st.charAt(i-1) == st.charAt(i)){
                mark += 1;
                if(mark == 6){
                    ans = "YES";
                    break;
                }
            } else {
                mark = 0;
            }
        }
        if(ans != "YES"){
            ans = "NO";
        }
        System.out.println(ans);
    }
}
