package org.example;
import java.util.Scanner;

public class Stroki {
    public static void number1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку хеъ");
        String s = scanner.nextLine();
        System.out.println("Введите количество повторений");
        int n = scanner.nextInt();
        if (n < 0) {
            throw new IllegalArgumentException("Ошибка, число должно быть больше 0 лол");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
    public static void number2() {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        try {
            int s = meted(str1, str2);
            System.out.println(s);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    public static int meted(String str1, String str2) {

        if ((str2 == null) || str2.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой или null.");
        }
        if (!str1.contains(str2)) {
            throw new IllegalArgumentException("Ошибка");
        }
        return str1.length() - str1.replace(String.valueOf(str2), "").length();
    }

    public static void stroki123() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String a = replaceNumbers(input);
        System.out.println("Исходная строка: " + input);
        System.out.println("Новая строка: " + a);
    }

    static String replaceNumbers(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой");
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char zamena = input.charAt(i);
            switch (zamena) {
                case '1':
                    b.append("один");
                    break;
                case '2':
                    b.append("два");
                    break;
                case '3':
                    b.append("три");
                    break;
                default:
                    b.append(zamena);
            }
        }
        return b.toString();
    }

    public static void deleteTwo() {
        StringBuilder str = new StringBuilder();
        System.out.println("Вы запустили четвёрное задание");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        str = new StringBuilder(scanner.nextLine());
        String result = String.valueOf(deleteTwoInsert(str));
        System.out.print("Результат: " + result);
    }
    public static StringBuilder deleteTwoInsert(StringBuilder str){
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой");
        }
        int index = 1;
        while (index < str.length()) {
            str.deleteCharAt(index);
            index += 1;
        }
        return str;
    }
}