package CF_tasks;//package exercisesPackage.training;

import java.util.Scanner;

/**
 * Created by Oleksii on 29.09.2016.
 */
public class Vowels {

    public static void main(String[] args) {
        char[] vowels = {'A', 'O', 'Y', 'E', 'U', 'I'};
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        String sentenceWithoutVowels = "";
        for (int i = 0; i < sentence.length(); i++) {
            Character.toLowerCase(sentence.charAt(i));
            if (!isVowel(sentence.charAt(i))) {
                sentenceWithoutVowels += "." + Character.toLowerCase(sentence.charAt(i));
            }
        }
        System.out.println(sentenceWithoutVowels);
    }

    private static boolean isVowel(Character c) {
        Character cc = Character.toLowerCase(c);
        return cc == 'a' ||
                cc == 'o' ||
                cc == 'y' ||
                cc == 'u' ||
                cc == 'e' ||
                cc == 'i';
    }
}
