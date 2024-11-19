package javabase;

import java.util.Random;
public class TratyZaNedely {
    public static void main(String[] args) {
        int[] rashody = new int[7];
        Random rand = new Random();
        int sum = 0;
        for(int i = 0; i < 7; i++) {
            rashody[i] = rand.nextInt(1000);
        }
        for(int i = 0; i < 7; i++){
            System.out.println((i + 1) + " день: " + rashody[i] + " rub");
            sum = sum + rashody[i];
            System.out.println("Сумма " + sum);
        }
        System.out.println("нaeли за всю неделю: " + sum);
    }
}
