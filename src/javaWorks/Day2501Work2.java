package javaWorks;
//готово
import java.util.Scanner;

public class Day2501Work2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цену товара: ");
        double startPrice = scanner.nextDouble();

        if ( startPrice < 0 || startPrice == 0 ) {
            System.out.println("Некоректная цена");
            System.out.println("Введите цену товара: ");
            startPrice = scanner.nextDouble();
        }

        System.out.println("Введите промокод: ");
        int promoCode = scanner.nextInt();
        
        double discount = 0;
        if(promoCode == 4525){
            discount = 0.3;
        } else if (promoCode == 6424 || promoCode == 7012) {
            discount = 0.2;
        } else if (promoCode == 7647 || promoCode == 9011 || promoCode == 6612) {
            discount = 0.1;
        } else {
            System.out.println("Несуществующий промокод!");
            System.out.print("Попробуйте сонва!");
            return;
        }
        double result = startPrice - (startPrice * discount);

        System.out.print("Цена на товар с учетом скидки: " + result);
    }
}
