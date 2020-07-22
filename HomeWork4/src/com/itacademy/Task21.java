package com.itacademy;

public class Task21 {

    static String str3 = "Hello ";

    public static void concatenation(String str3) {
        for (int i = 0; i < 5000; i++) {
            str3 += "World! ";
        }
        System.out.println(str3);
    }

    public static void concatenationBuilder(String str3) {
        StringBuilder strBuilder = new StringBuilder(str3);
        for (int i = 0; i < 5000; i++) {
            strBuilder.append("World! ");
        }
        System.out.println(strBuilder);
    }
}
