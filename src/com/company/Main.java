package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    System.out.println("Please enter a phrase: ");
	Scanner keyboard = new Scanner(System.in);
	String input = keyboard.nextLine();

	int answer = countWords(input);
	System.out.println("You're phrase had " + answer + " words");
    }

    public static int countWords(String s){

        int wordCount = 0;

        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;

            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;

            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
