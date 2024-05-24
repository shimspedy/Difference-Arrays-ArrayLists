import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int[] frequency = new int[26]; // 26 letters in the alphabet

        // Count the frequency of each letter
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            frequency[c - 'a']++; // 'a' - 'z' are the indices 0 - 25
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
            }
        }

        // Print the letters with the maximum frequency
        for (int i = 0; i < 26; i++) {
            if (frequency[i] == maxFrequency) {
                System.out.println((char) ('a' + i) + " (" + maxFrequency + ")");
            }
        }
    }
}