package javaWorks;
//готово
public class Day1801Work2 {
    public static void main(String[] args) {
        System.out.print("Четные цифры из первоночального массива: ");
        int[] masiv = new int[10];
        int n = 20;

        for (int i = 0; i < masiv.length; i++) {
            masiv[i] = n;
            n = n - 2;
            System.out.print(masiv[i] + ", ");
        }
    }
}
// чтобы выводился и 0 нужно увеличесть массив с 10 до 11