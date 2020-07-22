package com.itacademy;

public class Task19 {

   static String str = " Я изучаю Java. ";

    public static int wordCount(String str) {
        str = str.trim();
        String[] words = str.split("^\\s|\\s+|$\\s");
        int count = 0;
        for (String word : words) {
            count++;
        }
        System.out.println("Word count = " + count);
        return count;
    }
}
