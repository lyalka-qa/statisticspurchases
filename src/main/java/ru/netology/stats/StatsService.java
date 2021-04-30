package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0; // начинаем с нуля
        for (long purchase : purchases) {
            // аналог sum = sum + purchase
            // каждый раз прибавляем к текущей сумме новый элемент
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSum(long[] purchases) {
        long sum = 0; // начинаем с нуля
        for (long purchase : purchases) {
            sum += purchase;
        }
        long averagesum = sum / 12;
        return averagesum;
    }

    public long findMonthMaxPurchase(long[] purchases) {
        long currentMax = purchases[0];
        int month = 0;
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
                month = month + 1;
            }
        }
        return currentMax;
    }

    public long findMonthMinPurchase(long[] purchases) {
        long currentMin = purchases[0];
        int month = 0;
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
                month = month + 1;
            }
        }
        return currentMin;
    }

}
