package javaWorks;
//готов
import java.util.Scanner;

public class Day2901Work2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 9) + 1;

        int attempts = 3;

        System.out.println("Угадайка число от 1 до 9: ");

        while (attempts > 0) {
            int userNumber = scanner.nextInt();

            if (userNumber < 1 || userNumber > 9) {
                System.out.println("Я же сказала от 1 до 9!!!");
                continue;
            }
            attempts--;
            if (userNumber == secretNumber) {
                System.out.println("ВЫ УГАДАЛИ!!!");
                break;
            }
            if (userNumber < secretNumber) {
                System.out.println("Бро, чуть побольше");
            } else {
                System.out.println("Бро, чуть меньше");
            }
            if (attempts == 0){
                System.out.println("Но попытки уже закончились!");
            }
        }
    }
}
