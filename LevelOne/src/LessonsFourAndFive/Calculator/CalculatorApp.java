package LessonsFourAndFive.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;


/**
 * It's my simple app for calculation.
 * It has two methods. Method main and method showMenuAndStart.
 * showMenuAndStart is static method,
 * showing menu for choose operation and invoking methods for Calculator class.
 * 10.06.2020 Shirokov Fedor Spb Russia.
 */

public class CalculatorApp {

    public static void main(String[] args) throws IOException {

        showMenu();
        startCalculation();

    }
    public static void showMenu() {

        System.out.println("Программа калькулятора запущена... ");
        System.out.print("1: Сложение" + " ");
        System.out.print("2: Вычитание" + " ");
        System.out.print("3: Умножение" + " ");
        System.out.println("4: Деление");

    }

    public static void startCalculation() {

        Calculator calculator = new Calculator();
        int numberOperation = 0;
        String numberA = "";
        String numberB = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {

            System.out.println("Выбирете номер операции");
            numberOperation = Integer.parseInt(reader.readLine());

            System.out.println("Введите первое значение");
            numberA = reader.readLine();
            System.out.println("Введите второе значение");
            numberB = reader.readLine();

        } catch (IOException e) {

        }

        if (numberOperation == 1) {

            if ( numberA.contains(".") && numberB.contains(".")) {
                double a = Double.parseDouble(numberA);
                double b = Double.parseDouble(numberB);
                System.out.println(calculator.Add(a, b));
            } else if (numberA.length() >= 10 && numberB.length() >= 10) {
                long a = Long.parseLong(numberA);
                long b = Long.parseLong(numberB);
                System.out.println(calculator.Add(a, b));
            } else {
                int a = Integer.parseInt(numberA);
                int b = Integer.parseInt(numberB);
                System.out.println(calculator.Add(a, b));
            }
        } else if (numberOperation == 2) {

            if ( numberA.contains(".") && numberB.contains(".")) {
                double a = Double.parseDouble(numberA);
                double b = Double.parseDouble(numberB);
                System.out.println(calculator.Sub(a, b));
            } else if (numberA.length() >= 10 && numberB.length() >= 10) {
                long a = Long.parseLong(numberA);
                long b = Long.parseLong(numberB);
                System.out.println(calculator.Sub(a, b));
            } else {
                int a = Integer.parseInt(numberA);
                int b = Integer.parseInt(numberB);
                System.out.println(calculator.Sub(a, b));
            }

        } else if (numberOperation == 3) {

            if ( numberA.contains(".") && numberB.contains(".")) {
                double a = Double.parseDouble(numberA);
                double b = Double.parseDouble(numberB);
                System.out.println(calculator.Multi(a, b));
            } else if (numberA.length() >= 10 && numberB.length() >= 10) {
                long a = Long.parseLong(numberA);
                long b = Long.parseLong(numberB);
                System.out.println(calculator.Multi(a, b));
            } else {
                int a = Integer.parseInt(numberA);
                int b = Integer.parseInt(numberB);
                System.out.println(calculator.Multi(a, b));
            }

        } else if (numberOperation == 4) {

            if ( numberA.contains(".") && numberB.contains(".")) {
                double a = Double.parseDouble(numberA);
                double b = Double.parseDouble(numberB);
                System.out.println(calculator.Div(a, b));
            } else if (numberA.length() >= 10 && numberB.length() >= 10) {
                long a = Long.parseLong(numberA);
                long b = Long.parseLong(numberB);
                System.out.println(calculator.Div(a, b));
            } else {
                int a = Integer.parseInt(numberA);
                int b = Integer.parseInt(numberB);
                System.out.println(calculator.Div(a, b));
            }

        } else if (numberOperation > 4) {

            System.out.println("Вы ввели неправильный номер операции.");
            System.out.println("Запустите программу снова.");
        }

    }
}
