package com.company;

//Count words of each length. Count the number of words of each length in some text.

public class WordsLengthCounter {

    public static void wordsLength (String[] arr, int length) {

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != null) {
                int counter = 1;
                for (int j = i + 1; j < length; j++) {
                    if (arr[i].equals(arr[j])) {
                        arr[j] = null;
                        counter++;
                    }
                }
                System.out.println("Слово " + arr[i] + " длиной " + arr[i].length() + " повторяется " + counter + " раз");
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"asdf", "as", "asdf", "fdsa", "fas", "fdsa", "as", "as","as","as","as", "fas"};
        int length = arr.length;
        wordsLength(arr, length);
    }
}