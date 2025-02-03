package Algorithms;

import java.util.List;

public class PrefixSum implements RangeSum {
    private final List<Double> data;
    private double[] prefixSums;

    public PrefixSum(List<Double> data) {
        this.data = data;
        generatePrefixSums();
    }

    private void generatePrefixSums() {
        prefixSums = new double[data.size()];
        prefixSums[0] = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            prefixSums[i] = prefixSums[i - 1] + data.get(i);
        }
    }

    @Override
    public double getTotalReturns(int startIndex, int endIndex) {
        if (startIndex == 0) {
            return prefixSums[endIndex];
        } else {
            return prefixSums[endIndex] - prefixSums[startIndex - 1];
        }
    }
}
