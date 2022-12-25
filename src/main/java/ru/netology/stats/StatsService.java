package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {

    public long sumOfAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public long averageOfAllSales(long[] sales) {
        long average = sumOfAllSales(sales);
        return average / sales.length;
    }

    public int maximumSales(long[] sales) {
        int monthWithMaximumSales = 0;
        long maximumSales = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maximumSales) {
                maximumSales = sales[i];
                monthWithMaximumSales = i;
            }
        }
        return monthWithMaximumSales + 1;
    }

    public int minimumSales(long[] sales) {
        int monthWithMinimumSales = 0;
        long minimumSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minimumSale = sales[i];
                monthWithMinimumSales = i;
            }
        }
        return monthWithMinimumSales + 1;
    }

    public int lessThanAverageSales(long[] sales) {
        int monthsWithLessThanAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageOfAllSales(sales)) {
                monthsWithLessThanAverageSales++;
            }
        }
        return monthsWithLessThanAverageSales;
    }

    public int moreThanAverageSales(long[] sales) {
        int monthsWithmoreThanAverageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageOfAllSales(sales)) {
                monthsWithmoreThanAverageSales++;
            }
        }
        return monthsWithmoreThanAverageSales;
    }
}