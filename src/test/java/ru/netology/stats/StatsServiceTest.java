package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void sum() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.sum(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("calculateSum");
    }
    @Test
    void averageSum() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.averageSum(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("calculateAverageSum");
    }
    @Test
    void maxMonthNumber() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.maxMonthNumber(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("findMonthMaxPurchase");
    }

    @Test
    void minMonthNumber() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.minMonthNumber(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("findMonthMinPurchase");
    }

    @Test
    void moreThanAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.moreThanAverage(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("amountOfMonthMoreThanAverage");
    }

    @Test
    void lessThanAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.lessThanAverage(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("amountOfMonthLessThanAverage");
    }
}
