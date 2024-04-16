package javaWorks;
//готово
import java.util.Scanner;

public class Day2201Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальный баланс: ");
        double startBalance = scanner.nextDouble();

        if ( startBalance < 0 || startBalance == 0 ) {
            System.out.println("Некоректный баланс");
            System.out.println("Введите начальный баланс: ");
            startBalance = scanner.nextDouble();
        }
        double percent = 0.1;
        double targetBalance = 1000000;
        int years = 0;
        while (startBalance < targetBalance) {
            startBalance += startBalance * percent;
            years++;
        }
        System.out.printf("Через " + years + " лет он накопит миллион");
    }
}
