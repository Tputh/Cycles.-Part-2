public class Main {
    public static void main(String[] args) {

        System.out.println("Дз. Циклы. Часть 2");
        System.out.println("Дз. Циклы. Часть 2");

        // Задача 1
        System.out.println("Задача 1");

        int capital = 0;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + 15000;
            total = total + capital;
            month++;
            System.out.println("Месяц" + month + "сумма накоплений =" + total + "рублей");
        }

        // Задача 2
        System.out.println("Задача 2");


        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + "_");
            continue;
        }
        System.out.println();

        for (int b = 10; b >= 1; b = b - 1){
            System.out.print(b + "_");
        }
        System.out.println();


        // Задача 3
        System.out.println("Задача 3");

        int countryY = 12_000_000;
        int birthRate = 14;
        int mortality = 8;
        int dif = birthRate - mortality;
        int year = 2000;
        for (int s = 1; s < 10; s++) {
            countryY += countryY * dif/1000;
        }
        for (int d = 2000; d < 2010; d++) {
            year = year + 1;
        }
        System.out.println("Год" + year + "численность населения составляет" + countryY);

        // Задача 4-5
        System.out.println("Задача 4-5");

        int contribution = 15000;
        int period = 0;
        var percent = 0.07;
        while (contribution <= 12_000_000) {
            contribution += contribution * percent;
            period++;
            if (period % 6 == 0) {


                System.out.println("Месяц" + period + "сумма накоплений" + contribution + "рублей");
            }


        }


        // Задача 6
        System.out.println("Задача 6");

        int deposit = 15000;
        int depositPeriod = 9 * 12;
        int capital1 = 12_000_000;
        var percent1 = 0.07;
        int period1 = 1;
        while (period1 < depositPeriod) {
            deposit += deposit * percent1;
            period1++;
            System.out.println("Месяц" + period1 + "сумма накоплений" + deposit);
        }

        // Задача 7
        System.out.println("Задача 7");

        int december =31;
        int friday = 5;
        while (friday <= december) {
            friday = friday + 1;
            if (friday % 5 == 0) {
                System.out.println("Сегодне ПЯТНИЦА" + friday + "число");
            }
        }

        // Задача 8
        System.out.println("Задача 8");

        int yearFor = 1895;
        int yearAfter = 2055;
        while (yearFor < yearAfter) {
            yearFor = yearFor + 1;
            if (yearFor % 79 == 0) {
                System.out.println(yearFor);
            }
        }
    }
}