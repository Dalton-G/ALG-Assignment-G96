package Algorithms;

import java.util.List;

public class BruteForce implements RangeSum {
    private final List<Double> data;

    public BruteForce(List<Double> data) {
        this.data = data;
    }

    @Override
    public double getTotalReturns(int startIndex, int endIndex) {
        double sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += data.get(i);
        }
        return sum;
    }
}
