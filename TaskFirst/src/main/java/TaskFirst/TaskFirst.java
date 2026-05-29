package TaskFirst;

import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // 1. Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // 2. Арифметические операции
        System.out.println("Сложение (a + b): " + (a + b));
        System.out.println("Вычитание (a - b): " + (a - b));
        System.out.println("Умножение (a * b): " + (a * b));

        // Обработка деления на ноль
        if (b != 0) {
            System.out.println("Деление (a / b): " + ((double) a / b));
        } else {
            System.out.println("Деление (a / b): На ноль делить нельзя!");
        }

        scanner.close();
    }
}

