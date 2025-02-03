package TestCases;

import java.util.Arrays;
import java.util.List;

public class InvestmentDataMonth {
    public static List<Double> getDailyReturns() {
        return Arrays.asList(
                5.2, -3.1, 12.8, 7.5, -4.9,
                2.3, 8.1, -1.5, 10.2, -6.7,
                15.3, -2.8, 4.1, 9.0, -3.4,
                1.7, 6.5, -0.8, 11.2, -5.1,
                3.9, 7.8, -2.2, 13.1, -4.6,
                2.7, 8.5, -1.9, 10.6, -7.0
        );
    }

    public static List<List<Integer>> getQueries() {
        return Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(7, 12),
                Arrays.asList(3, 8),
                Arrays.asList(15, 20),
                Arrays.asList(5, 10),
                Arrays.asList(2, 7),
                Arrays.asList(10, 15),
                Arrays.asList(18, 23),
                Arrays.asList(4, 9),
                Arrays.asList(20, 25),
                Arrays.asList(6, 11),
                Arrays.asList(12, 17),
                Arrays.asList(8, 13),
                Arrays.asList(22, 27),
                Arrays.asList(14, 19)
        );
    }
}
