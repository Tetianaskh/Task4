package com.company;

import java.util.Scanner;

public class Task4 {

    // Обязательные задачи:

    // Задача 1. (Используя цикл while найти наибольшее из 10 чисел, вводимых пользователем)
    public static void exercise01() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник вычислит максимальное из десяти введенных чисел:");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int max = 0;
        while (i < 10) {
            System.out.println("Введите, пожалуйста, число:");
            int number = sc.nextInt();
            if (max < number || i == 0) {
                max = number;
            }
            i++;
        }
        System.out.println("Максимальное число из введенных Вами = " + max);
    }

    //Задача 2. (Найти сумму всех нечетных чисел из интервала 3...100)
    public static void exercise02() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник расчитает сумму всех нечетных чисел из интервала 3....100:");
        int i = 3;
        int sum = 0;
        while (i < 100) {
            int number = i;
            if (number % 2 != 0) {
                sum += number;
            }
            i++;
        }
        System.out.println("Сумма всех нечетных чисел из интервала 3....100 равна: " + sum);
    }

    // Задача 3. (Пользователь вводит координаты центра окружности и ее радиус после чего ользователь вводит
    // координаты 5ти точек, определить сколько из них лежат в окружности (для определения рассеяний и проверок
    // сделать отдельные методы))
    public static void exercise03() {

    }

    // Задача 4. (Написать метод, который принимает число и возвращает true если оно простое и false - если нет)
    public static boolean isPrimeNumber (int number) {
        int i = 2;
        while (i < (number - 1)) {
            if (number % i != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void exercise04() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник определит является ли введенное Вами число простым");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, число:");
        int number = sc.nextInt();
        if (isPrimeNumber(number)){
        System.out.println("Введенное число является простым!");
        } else {
            System.out.println("Введенное число НЕ является простым!");
        }
    }

    // Дополнительные задачи:

    // Задача 1. (Написать метод, который принимает произвольно целое число и возвращает сумму всех его цифр)
    public static void test () {

    }

    public static void exercise001 () {

    }

    public static void main(String[] args) {
        exercise04();
    }
}