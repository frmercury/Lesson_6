package com.company;

import java.util.Scanner;

//Count the single character frequencies

public class LettersCount {

    public static String getScanner() {                                // Ввод строки
        System.out.println("Input string - we will count each letter frequencies: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void letterCounter (String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) {
                int counter = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == (arr[j])) {
                        arr[j] = 0;
                        counter++;
                    }
                }
                System.out.println("Литера " + arr[i] + " повторяется "+ counter + " раз");
            }
        }
    }

    public static void main(String[] args) {

        letterCounter(getScanner());
    }
}
