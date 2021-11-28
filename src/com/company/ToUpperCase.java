package com.company;

import java.util.Scanner;

//Change given text into all upper case or lower case or change the first letter of each word (or
//sentence) to upper and the rest to lower

public class ToUpperCase {

    public static String getScanner() {              // Ввод строки
        System.out.println("Input string to convert: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String firstLetterToUpper(String str) {
        String words [] = str.split(" ");
        String firstLower = "";
        for (String w : words) {
            String firstLetter = w.substring(0, 1);
            String otherLetters = w.substring(1);
            firstLower += firstLetter.toUpperCase() + otherLetters + " ";
        }
            return firstLower;
    }

    public static void main (String[]args){
    System.out.println(" To lowercase: " + "\n" + toLowerCase(getScanner()));
    System.out.println("To UPPERCASE: " + "\n" + toUpperCase(getScanner()));
    System.out.println("Capitalize 1st letter: " + "\n" + firstLetterToUpper(getScanner()));

    }
}