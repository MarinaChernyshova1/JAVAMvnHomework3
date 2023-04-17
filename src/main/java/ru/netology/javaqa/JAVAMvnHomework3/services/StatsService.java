package ru.netology.javaqa.JAVAMvnHomework3.services;

public class StatsService {
    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int totalSailAmount(int[] sales) {
        int totalAmount = sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] +
                sales[11];
        return (int) totalAmount;
    }

    public int averageAmount(int[] sales) {

        int averageSale = totalSailAmount(sales);

        return averageSale / sales.length;

    }

    public int aboveAverageSale(int[] sales) {
        int monthAboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageAmount(sales)) {
                monthAboveAverage++;
            }
        }

        return monthAboveAverage;
    }
    public int belowAverageSale(int[] sales) {
        int monthBelowAverage = 0;
        for (int sale : sales) {
            if (sale < averageAmount(sales)) {
                monthBelowAverage++;
            }
        }

        return monthBelowAverage;
    }


}
