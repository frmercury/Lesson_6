package com.company;

import java.util.Scanner;

//Count the words in some text

public class WordsCount {

    public static String getScanner() {              // Ввод строки
        System.out.println("Input some text: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int wordsCounter (String str) {
        String words [] = str.split(" ");
        return words.length;
    }


    public static void main(String[] args) {
        System.out.println("Колличество слов в строке: " + wordsCounter(getScanner()));
    }
}
