import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        String[] words = inputString.split(" ");

        StringBuilder reverseText = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverseText.append(words[i]);
            reverseText.append(" ");
        }

        System.out.println(reverseText.toString().trim());

    }

}
