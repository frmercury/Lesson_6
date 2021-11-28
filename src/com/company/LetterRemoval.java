package com.company;

import java.util.Scanner;

//Given a phrase and a letter (or series of letters) remove all occurrences of that letter(s) in the phrase.

public class LetterRemoval {

    public static String getString() {              // Ввод строки
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static String removedValue() {
        System.out.println("Value need to remove: ");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        return value;
    }

    public static void removal (String s, String value) {
        String str = s.replace(value, "");
        System.out.println(str);
    }

    public static void main(String[] args) {
        removal(getString(), removedValue());
    }
}
