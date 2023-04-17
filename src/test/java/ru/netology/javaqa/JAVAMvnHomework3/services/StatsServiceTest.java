package ru.netology.javaqa.JAVAMvnHomework3.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expected, actualMonth);
    }

    @Test
    public void shouldMonthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expected, actualMonth);
    }

    @Test
    public void shouldTotalSummaSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.totalSailAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.averageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSumMonthAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSale(sales);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSumMonthBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSale(sales);

        Assertions.assertEquals(expected, actual);

    }


}
