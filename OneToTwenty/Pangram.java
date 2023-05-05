package OneToTwenty;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        Set<Character> alphabet = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            alphabet.add(sentence.charAt(i));
            if (alphabet.size() == 26) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
