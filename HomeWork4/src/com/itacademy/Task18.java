package com.itacademy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {

    static String str = "Текстовая, строка, с несколькими! знаками: препинания.";

    public static int  numberOfPunctuationMarks(String str) {
        int quantity = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '!' || symbol == ':' || symbol == '.') {
                quantity++;
            }
        }
        System.out.println("Number of punctuation marks = " + quantity);
        return quantity;
    }

    public static int numberOfPunctuationMarksPattern(String str) {
        Pattern p = Pattern.compile("[!,.;:?\\-]");
        Matcher matcher = p.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Number of punctuation marks = " + count);
        return count;
    }
}