package com.company;

import java.util.Scanner;

//Given a word, print a square made from letter rotations of the word as in:

public class WordRotate {

    public static String getScanner() {              // Ввод строки
        System.out.println("Input word to rotate: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void printRotatedString (String str) {
        int len = str.length();
        StringBuffer s = new StringBuffer(str);
        s.append(str);
        for (int i = 0; i < len; i++) {
            for (int j=0; j != len; j++)
                System.out.print(s.charAt(i + j));
                System.out.println();
        }
    }

    public static void main(String[] args) {
        printRotatedString(getScanner());
    }
}
