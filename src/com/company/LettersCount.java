package com.company;

import java.util.Scanner;

//Count the single character frequencies

public class LettersCount {

    public static String getScanner() {                                // Ввод строки
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void lettersCounter (String str) {
        char[] charArr = str.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {               //Сортировка массива
            for (int j = 0; j < i; j++) {
                if (charArr[j] < charArr[j + 1]) {
                    char swap = charArr[j];
                    charArr[j] = charArr[j + 1];
                    charArr[j + 1] = swap;
                }
            }
        }
        int repeat = 0;                                                 //Подсчет повторов
        for (int i = 0; i < charArr.length; i++) {
            int charRepeater = 1;
            if ( i == repeat ) {
                for (int j = i+1; j < charArr.length; j++){
                    if (charArr[i] == charArr[j]) {
                        charRepeater ++;
                        repeat = j+1;
                    } else {
                        break;
                    }
                }
            } else {
                continue;
            }
            System.out.println(charArr[i] + " : " + charRepeater);
            }
        }

    public static void main(String[] args) {
        lettersCounter(getScanner());
    }
}