package week6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();

        TextGame game = new FancyTextGame();
        boolean Palindrome = game.isPalindrome(input);

        System.out.println("Hasil: " + (Palindrome ? "Palindrome" : "Bukan Palindrome"));

        scanner.close();
    }
}

