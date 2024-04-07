import java.util.Scanner;

public class AstonTest2  {

    public static void main(String[] args) {

        // Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
        // В результате сравнения в консоль должно быть выведено одно из сообщений:
        // "Строки неидентичны" или "Строки идентичны"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку a");
        String a = scanner.next();
        System.out.println("Введите строку b");
        String b = scanner.next();

        boolean diff = a.equals(b);
        if (diff) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
