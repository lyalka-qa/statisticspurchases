package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        // вызываем целевой метод:
        long actual = service.calculateSum(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("calculateSum");
    }
    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        // вызываем целевой метод:
        long actual = service.calculateAverageSum(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("calculateAverageSum");
    }
    @Test
    void findMonthMaxPurchase() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;

        // вызываем целевой метод:
        long actual = service.findMonthMaxPurchase(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("findMonthMaxPurchase");
    }

    @Test
    void findMonthMinPurchase() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        // вызываем целевой метод:
        long actual = service.findMonthMinPurchase(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

        System.out.println("findMonthMinPurchase");
    }


}
