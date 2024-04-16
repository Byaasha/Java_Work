package javaWorks;
//готово
import java.util.Random;
import java.util.Arrays;

public class Day1801Work1 {
    public static void main(String[] args) {
        int[] massiv = new int[50];
        Random random = new Random();


        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(50) + 1;
        }
        System.out.println("Массив: " + Arrays.toString(massiv));

        int max = massiv[0];
        int min = massiv[0];
        int sum = 0;

        for (int num : massiv) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }
        double average = (double) sum / massiv.length;

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Среднее арифметическое: " + average);
    }
}
