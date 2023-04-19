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
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int totalSailAmount(int[] sales) {
        int totalAmount = 0;
        for (int sale : sales) {
            totalAmount = totalAmount + sale;
        }
        return (int) totalAmount;
    }

    public int averageAmount(int[] sales) {

        int averageSale = totalSailAmount(sales);

        return averageSale / sales.length;

    }

    public int aboveAverageSale(int[] sales) {
        int monthAboveAverage = 0;
        int averageAmount = averageAmount(sales);
        for (int sale : sales) {
            if (sale > averageAmount) {
                monthAboveAverage++;
            }
        }

        return monthAboveAverage;
    }

    public int belowAverageSale(int[] sales) {
        int monthBelowAverage = 0;
        int averageAmount = averageAmount(sales);
        for (int sale : sales) {
            if (sale < averageAmount) {
                monthBelowAverage++;
            }
        }

        return monthBelowAverage;
    }


}
