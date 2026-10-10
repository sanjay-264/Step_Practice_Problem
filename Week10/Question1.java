package Week10;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String word = Sc.next().toLowerCase();
        int vowels = 0, consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else
                consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}