package SkillStorm.DailyProjects.Week_10_.Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Singleton {

    public static void main(String[] args) {
        randomChar();
    }

    public static void randomChar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four characters: ");
        String input = scanner.nextLine();

        // Convert input string to character array
        char[] chars = input.toCharArray();

        // Convert char array to list for shuffling
        List<Character> charList = Arrays.asList(new Character[] { chars[0], chars[1], chars[2], chars[3] });

        // Shuffle the list
        Collections.shuffle(charList);
    }
}
