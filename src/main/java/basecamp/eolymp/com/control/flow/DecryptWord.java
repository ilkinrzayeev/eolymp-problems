package basecamp.eolymp.com.control.flow;

import java.util.Scanner;

public class DecryptWord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        StringBuilder decryptedWord = new StringBuilder();

        for (char c : word.toCharArray()) {
            char decryptedChar;
            if (c == 'a') {
                decryptedChar = 'z';
            } else {
                decryptedChar = (char) (c - 1);
            }
            decryptedWord.append(decryptedChar);
        }
        System.out.println(decryptedWord);
    }
}
