package exam1;

import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] expensesDays = new int[30];
        while (true) {
            System.out.println("Меню:");
            System.out.println("1 - Ввести расходы на определенный день");
            System.out.println("2 - Показать расходы за месяц");
            System.out.println("3 - Показать самый большой расход за месяц");
            System.out.println("4 - Показать конвертацию расхода за каждый день");
            System.out.println("0 - Выход");
            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                expenses(scanner, expensesDays);
            } else if (choice == 2) {
                expensesMonth(expensesDays);
            } else if (choice == 3) {
                maxExpense(expensesDays);
            } else if (choice == 4) {
                convertExpenses(expensesDays);
            } else if (choice == 0) {
                System.out.println("Пока!");
                System.exit(0);
            } else {
                System.out.println("Неправильный выбор. Попробуйте снова!");
            }
        }
    }

    public static void expenses(Scanner scanner, int[] expenses) {
        System.out.print("Введите день (от 1 до 30): ");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Неверный день,попробуйте еще раз");
            return;
        }
        System.out.print("Введите расход за этот день: ");
        int amount = scanner.nextInt();
        expenses[day - 1] = amount;
        System.out.println("Расход за день " + day + " введён");
    }

    public static void expensesMonth(int[] expenses) {
        System.out.println("Расход за месяц:");
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] != 0) {
                System.out.println((i + 1) + " день - " + expenses[i] + " рублей");
            }
        }
    }

    public static void maxExpense(int[] expenses) {
        int maxExpense = 0;
        int maxDay = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
                maxDay = i + 1;
            }
        }
        if (maxDay != 0) {
            System.out.println("Самый высокий расход за месяц: " + maxDay + " день - " + maxExpense + " рублей");
        } else {
            System.out.println("Нет записей за этот месяц.");
        }
    }

    public static void convertExpenses(int[] expenses) {
        double euro = 0.0101;
        double dollar = 0.0109;
        double yuan = 0.079;
        System.out.println("Конвертация расхода:");
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] != 0) {
                double expenseEuro = expenses[i] * euro;
                double expenseDollar = expenses[i] * dollar;
                double expenseYuan = expenses[i] * yuan;
                System.out.println((i + 1) + " день - Евро: " + expenseEuro + ", Доллар: " + expenseDollar + ", Юани: " + expenseYuan);
            }
        }
    }
}
