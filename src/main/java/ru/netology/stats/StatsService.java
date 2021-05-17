package ru.netology.stats;

public class StatsService {
    public int sum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int averageSum(int[] purchases) {
        int sum = sum(purchases);
        return sum / purchases.length;
    }

    public int maxMonthNumber(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
               max = purchase;
            }
        }
        int monthCount = 0;
        int maxMonthNumber = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                maxMonthNumber = monthCount;
            }
    }
        return maxMonthNumber;
    }

    public int minMonthNumber(int[] purchases) {
        int min = purchases[0];
        int month = 0;
        int minMonthNumber = 0;
        for (int purchase : purchases) {
            month = month + 1;
            if (min > purchase) {
                min = purchase;
                minMonthNumber = month;
            }
        }
        return minMonthNumber;
    }

    public int moreThanAverage (int[] purchases) {
        int averageSum = averageSum(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase > averageSum) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int lessThanAverage (int[] purchases) {
        int averageSum = averageSum(purchases);
        int monthCount = 0;
        for (int purchase : purchases) {
            if (purchase < averageSum) {
                monthCount++;
            }
        }
        return monthCount;
    }
}
