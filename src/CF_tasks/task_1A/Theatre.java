package CF_tasks;

import java.util.Scanner;

/**
 * Created by Oleksii on 27.09.2016.
 */
public class Theatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();

        long widthN = 0;
        long heightM = 0;

        if (n % a != 0) {
            widthN = n / a + 1;
        } else {
            widthN = n / a;
        }
        if (m % a != 0) {
            heightM = m / a + 1;
        } else {
            heightM = m / a;
        }
        long count = widthN * heightM;
        System.out.print(count);
    }

}
