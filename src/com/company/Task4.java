package com.company;

import java.util.Scanner;

public class Task4 {

    // Обязательные задачи:

    // Задача 1. (Используя цикл while найти наибольшее из 10 чисел, вводимых пользователем)
    public static void exercise01() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник вычислит максимальное из десяти введенных чисел");
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
        int number = 3;
        int sum = 0;
        while (number < 100) {
            if (number % 2 != 0) {
                sum += number;
            }
            number++;
        }
        System.out.println("Сумма всех нечетных чисел из интервала 3....100 равна: " + sum);
    }

    // Задача 3. (Пользователь вводит координаты центра окружности и ее радиус после чего пользователь вводит
    // координаты 5ти точек, определить сколько из них лежат в окружности (для определения рассеяний и проверок
    // сделать отдельные методы))

    /***
     * Расчитывает расстояние между двумя точками
     * @param xPoint1 - х координата первой точки
     * @param yPoint1 - у координата первой точки
     * @param xPoint2 - х координата второй точки
     * @param yPoint2 - у координата второй точки
     * @return - расстояние между точками
     */
    public static double distanceToPoint(double xPoint1, double yPoint1, double xPoint2, double yPoint2) {
        return Math.sqrt(Math.pow(xPoint1 - xPoint2, 2) + Math.pow(yPoint1 - yPoint2, 2));
    }

    /***
     *
     * @param xCenter - х координата центра окружности
     * @param yCenter - у координата центра окружности
     * @param radius - радиус окружности
     * @param xPoint - х координата точки
     * @param yPoint - у координата точки
     * @return - внутренние границы окружности
     */
    public static boolean isInsideCircle(double xCenter, double yCenter, double radius, double xPoint, double yPoint) {
        double distanceToPoint = distanceToPoint(xCenter, yCenter, xPoint, yPoint);
        return distanceToPoint <= radius;
    }

    public static void exercise03() {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник определит сколько точек лежит в окружности:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, координаты центра окружности (X Y):");
        int xCenter = sc.nextInt();
        int yCenter = sc.nextInt();
        System.out.println("Введите, пожалуйста, радиус окружности:");
        int radius = sc.nextInt();
        int numberPoint = 0;
        int sumInsidePoint = 0;
        while (numberPoint < 5) {
            System.out.println("Введите, пожалуйста, координаты точки (X Y):");
            int xPoint = sc.nextInt();
            int yPoint = sc.nextInt();
            if (isInsideCircle(xCenter, yCenter, radius, xPoint, yPoint)) {
                sumInsidePoint++;
            }
            numberPoint++;
        }
        System.out.println("Количество точек лежащих в окружности = " + sumInsidePoint);
    }


    // Задача 4. (Написать метод, который принимает число и возвращает true если оно простое и false - если нет)

    /***
     * Проверяет делится ли число на другие числа кроме 1 и самого себя
     * @param number - вводимое число пользователем
     * @return - простое число или нет
     */
    public static boolean isPrimeNumber (int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
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

    /***
     * Принимает произвольно целое число и возвращает сумму всех его цифр
     * @param startNumber - вводимое число пользователем
     * @return - сумма всех цифр введенного числа
     */
    public static int getSomeOfDigit (int startNumber) {
        int number = startNumber;
        int sum = 0;
        while (number > 0) {
            int digit = (number % 10);
            number = number / 10;
            sum += digit;
        }
        return sum;
    }

    public static void exercise001 () {
        System.out.println("Добрый день!");
        System.out.println("Наш помощник посчитает сумму всех цифр введенного Вами числа");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, число:");
        int startNumber = sc.nextInt();
            System.out.println("Сумма всех цифр введенного Вами числа = " + getSomeOfDigit(startNumber));
    }

    public static void main(String[] args) {
        exercise01();
        exercise02();
        exercise03();
        exercise04();
        exercise001();
    }
}