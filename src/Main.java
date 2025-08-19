public class Main {
    public static void main(String[] args) {
        //task 1
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total += deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        //task 2
        int i = 0;
        while (i <= 9) {
            i++;
            System.out.print(i + " ");
        }
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        //task 3
        int mortality = 8;
        int birthrate = 17;
        int people = 12_000_000;
        int years;
        for (years = 1; years <= 10; years++) {
            int newBirth = people * birthrate / 1000;
            int deaths = people * mortality / 1000;
            people = people + newBirth - deaths;
            System.out.println("Год " + years + ", численность населения составляет " + people);
        }
        //task 4, 5
        int deposit1 = 15000;
        int total1 = 0;
        int month1 = 0;
        while (total1 <= 12_000_000) {
            total1 = total1 + (total1 * 7) / 100;
            total1 += deposit1;
            month1++;
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + total1 + " рублей");
        }
        if (month1 % 6 == 0) {
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + total1 + " рублей");
        }
        //task 6
        int deposit2 = 15000;
        int total2 = 0;
        int month2 = 0;
        while (month2 <= 107) {
            month2++;
            total2 += deposit2;
            total2 = total2 + (total2 * 7) / 100;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " накоплено " + total2 + " рублей.");
            }
        }
        //task 7
        int firstFriday = 4;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        //task 8
        int cometaYear = 0;
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        do {
            cometaYear += 79;
            if (cometaYear > startYear && cometaYear < endYear) {
                System.out.println(cometaYear);
            }
        } while (cometaYear < endYear);
    }
}
