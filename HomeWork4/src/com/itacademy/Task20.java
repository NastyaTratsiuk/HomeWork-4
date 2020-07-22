package com.itacademy;

public class Task20 {

    static String str = "И английский тоже надо ";

    public static void printLastLetter(String str) {
        StringBuilder res = new StringBuilder();
        String[] wordes = str.split("\\s+");
        for (String word : wordes) {
            res.append(word.toCharArray()[word.length() - 1]);

        }
        System.out.println(res.toString());
    }
}
