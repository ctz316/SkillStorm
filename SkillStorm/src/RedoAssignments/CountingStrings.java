package RedoAssignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountingStrings {

    public static Map<Character, Long> countCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return new HashMap<>();
        }
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    public static Map<String, Long> countWords(String[] words) {
        if (words == null || words.length == 0) {
            return new HashMap<>();
        }
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which function would you like to use? Enter 1 for countCharacters or 2 for countWords:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left by nextInt()

        if (choice == 1) {
            System.out.println("Enter a string:");
            String str = scanner.nextLine();
            System.out.println(countCharacters(str));
        } else if (choice == 2) {
            System.out.println("Enter words separated by spaces:");
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            System.out.println(countWords(words));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
