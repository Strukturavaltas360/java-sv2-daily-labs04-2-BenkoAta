package day03;

import java.util.List;

public class Stock {
    private List<Double> dailyRates;

    public Stock(List<Double> dailyRates) {
        this.dailyRates = dailyRates;
    }

    public double maxProfit() {
        double maxProfit = 0;
        double localMin = dailyRates.get(0);
        double localMax = dailyRates.get(0);

        for (int i = 0; i < dailyRates.size() - 1; i ++) {
            double todayRate = dailyRates.get(i);
            double tomorrowRate = dailyRates.get(i + 1);

            if (tomorrowRate > localMax) {
                localMax = tomorrowRate;
            } else {
                if (localMax - localMin > maxProfit) maxProfit = localMax - localMin;
                localMax = tomorrowRate;
                localMin = tomorrowRate;
            }
        }
        if (localMax - localMin > maxProfit) maxProfit = localMax - localMin;

        return maxProfit;
    }
}
