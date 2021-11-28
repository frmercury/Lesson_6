package com.company;

import java.util.Random;
import java.util.Scanner;

public class ClassWorkTask {

    public static String getScanner() {              // Ввод строки
        System.out.println("Input mode of the string: alpha = 1; numeric = 2; alphanumeric = 3");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Integer getLength() {              // Ввод строки
        System.out.println("Input length of the string: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String randomString (String mode, int length) {
        String str1 = null;
        int leftLimit = 0;
        int rightLimit = 0;
        switch (mode) {
            case "1":
                leftLimit = 65; // letter 'a'
                rightLimit = 122; // letter 'z'
                break;
            case "2":
                leftLimit = 48; // number '0'
                rightLimit = 57; // number '9'
                break;
            case "3":
                leftLimit = 48; // number '0'
                rightLimit = 122; // letter 'z'
                break;
            default:
                System.out.println("Undefined mode");
                break;
        }

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char)randomLimitedInt);
        }
        str1 = buffer.toString();
        String generatedStr = str1.replaceAll("[^\\w-]|_", "");
        return generatedStr;
    }

    public static void main(String[] args) {
        System.out.println(randomString(getScanner(), getLength()));
    }
}