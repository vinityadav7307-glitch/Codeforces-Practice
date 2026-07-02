// Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

// Note, that during capitalization all the letters except the first one remains unchanged.

// Input
// A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.

// Output
// Output the given word after capitalization.

// Examples
// InputCopy
// ApPLe
// OutputCopy
// ApPLe
// InputCopy
// konjac
// OutputCopy
// Konjac

import java.util.Scanner;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s = sc.next();

        char word = Character.toUpperCase(s.charAt(0));
        System.out.println(word + s.substring(1));
        sc.close();
    }
}
