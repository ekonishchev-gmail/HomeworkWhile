//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int totalPeople = 12000000;
        int year = 1;
        int birthrate = 17 * 12000;
        int mortality = 8 * 12000;
        for (; year <= 10; year++) {
            totalPeople = totalPeople + birthrate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + totalPeople);
        }

        int money = 15000;
        int month = 0;
        int totalMoney = 0;
        while (totalMoney <= 12000000) {
            month++;
            totalMoney = totalMoney + totalMoney / 100 * 7;
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalMoney + " рублей");
        }

        int amountMoney = 15000;
        int amountMonth = 0;
        int amountTotalMoney = 0;
        while (amountTotalMoney <= 12000000) {
            amountMonth++;
            amountTotalMoney = amountTotalMoney + amountTotalMoney / 100 * 7;
            amountTotalMoney = amountTotalMoney + amountMoney;
            if (amountMonth % 6 == 0) {
                System.out.println("Месяц " + amountMonth + ", сумма накоплений равна " + amountTotalMoney + " рублей");
            }
        }

        int deposit = 15000;
        int halfOfYear = 0;
        int result = 0;
        while (halfOfYear <= 18) {
            halfOfYear++;
            result = result + result / 100 * 7;
            result = result + deposit;
            System.out.println("Прошло еще полгода, сумма накоплений равна " + result);
        }

        int firstFriday = 5;
        int totalDays = 31;
        for (int day = firstFriday; day <= totalDays; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }

        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometInterval = 79;
        for (int m = 0; m <= endYear; m += cometInterval) {
            if (m >= startYear) {
                System.out.println(m);
            }
        }














    }
}