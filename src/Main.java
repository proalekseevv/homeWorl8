import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int total2 = 0;
        while (total < 2_459_000) {
            total = total + salary;
            total2 += 1;
            System.out.println("Месяц " + total2 + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int total = 0;
        while (total < 10) {
            total += 1;
            System.out.print(total + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {

            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int ortality = population / 1000 * 8;
        int total = population;
        for (int i = 1; i <= 10; i = i + 1) {
            total += birthRate - ortality;
            System.out.println("Год " + i + " численность населения составляет " + total);

        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 12_000_000;
        double sum = 15000;
        int month = 1;
        double percentagePerMonth = 0.07;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        while (sum <= contribution) {
            month += 1;
            sum = sum * (1 + percentagePerMonth);
            System.out.println("Год " + month + " численность населения составляет " + numberFormat.format(sum));
        }


    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 12_000_000;
        double sum = 15000;
        int months = 12 * 9;

        double percentagePerMonth = 0.07;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        for (int month = 1; month <= months; month++) {
            month += 1;
            sum = sum * (1 + percentagePerMonth);
            if (month % 6 == 0) {

                System.out.println("Год " + month + " численность населения составляет " + numberFormat.format(sum));
            }
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 12_000_000;
        double sum = 15000;
        int months = 12 * 9;
        double percentagePerMonth = 0.07;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        for (int month = 1; month <= months; month++) {
            month += 1;
            sum = sum * (1 + percentagePerMonth);
            if (month % 6 == 0) {

                System.out.println("Год " + month + " численность населения составляет " + numberFormat.format(sum));
            }
        }

    }

}
