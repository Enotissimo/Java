import java.util.Scanner;

public class AstonTest1 {

    public static void main(String[] args) {

        // 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
        // сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов:
        // "a > b", "a < b" или "a = b";
        // совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите операцию (+, -, *, /)");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите число b");
        int b = scanner.nextInt();

            if (operation == '+') {
                int result = a + b;
            System.out.println("Результат операции " + result);
                } else if (operation == '-') {
                int result = a - b;
            System.out.println("Результат операции " + result);
                } else if (operation == '*') {
                int result = a * b;
                System.out.println("Результат операции " + result);
                } else if (operation == '/')
                {
                float result = (float) a / b;
                    if (b == 0)
                    {System.out.println("Деление на 0 невозможно. Попробуйте снова.");}
                    else
                    {System.out.println("Результат операции " + result);}
                }
            else {
                System.out.println("Введена неверная операция. Попробуйте снова, используя +, -, *, /");
            }

        if (a > b)
        {
            System.out.println("a > b");
        }

        if (a < b) {
            System.out.println("a < b");
        }
        if (a == b) {
            System.out.println("a = b");
        }
        }
}
