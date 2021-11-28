package com.company;

//1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
//first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.

import java.util.Scanner;

public class ProductCodeValidation {
    public static String getScanner() {                                             // Ввод строки
        System.out.println("Input string: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void validator (String s) {
                                                                                    //Убираем буквенные символы
        String str = s.replaceAll("[A-Z]", "");
        String arr [] = str.split(" ");

        int validateCode = Integer.parseInt(arr[1]);                                //Принимаем код валидации

        int validator = Integer.parseInt(arr[0].substring(0, 2));
        int validator1 = Integer.parseInt(arr[0].substring(2, 4));
        int validator2 = Integer.parseInt(arr[0].substring(4));
        int validateSum = validator*validator1*validator2;                          //Значение проверяемого идентификатора

        if (validateSum == validateCode) {                                          //Проверка соответствия полученного с истинным значений
            System.out.println("Correct identifier");
        } else {
            System.out.println("Wrong identifier");
        }
    }

    public static void main(String[] args) {
        validator(getScanner());
    }
}