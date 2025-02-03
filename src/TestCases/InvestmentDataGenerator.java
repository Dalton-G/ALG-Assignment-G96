package TestCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InvestmentDataGenerator {
    public static List<Double> generateDailyReturns(int numDays) {
        List<Double> dailyReturns = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numDays; i++) {
            double returnPercentage = (random.nextDouble() * 40) - 20;
            dailyReturns.add(returnPercentage);
        }
        return dailyReturns;
    }

    public static List<List<Integer>> generateQueries(int numQueries, int numDays) {
        List<List<Integer>> queries = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numQueries; i++) {
            int start = random.nextInt(numDays);
            int end = random.nextInt(numDays);

            if (start > end) {
                int temp = start;
                start = end;
                end = temp;
            }
            queries.add(Arrays.asList(start, end));
        }
        return queries;
    }
}
