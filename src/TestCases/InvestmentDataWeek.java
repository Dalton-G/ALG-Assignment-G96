package TestCases;

import java.util.Arrays;
import java.util.List;

public class InvestmentDataWeek {
    public static List<Double> getDailyReturns() {
        return Arrays.asList(2.5, -6.3, 10.3, 2.3, -13.0, 20.3, -15.0);
    }

    public static List<List<Integer>> getQueries() {
        return Arrays.asList(
                Arrays.asList(0, 2),
                Arrays.asList(1, 2),
                Arrays.asList(0, 4),
                Arrays.asList(4, 6)
        );
    }
}
