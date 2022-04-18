package ru.netology;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */

    public long findMin(long[] incomes) {
        long current_min_index = 0;
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }
}
