package com.company;

import java.util.Scanner;

public class LetterRemoval {

    public static String getString() {              // Ввод строки
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static String removedValue() {
        System.out.println("Replaced value: ");
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
