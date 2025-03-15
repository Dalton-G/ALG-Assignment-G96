package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrefixSum implements RangeSum {
    private final List<Double> data;
    private List<Double> prefixSums;

    public PrefixSum(List<Double> data) {
        this.data = data;
        generatePrefixSums();
    }

    private void generatePrefixSums() {
        prefixSums = new ArrayList<>();
        prefixSums.add(data.get(0));

        for (int i = 1; i < data.size(); i++) {
            prefixSums.add(prefixSums.get(i - 1) + data.get(i));
        }
    }

    @Override
    public double getTotalReturns(int startIndex, int endIndex) {
        if (startIndex == 0) {
            return prefixSums.get(endIndex);
        } else {
            return prefixSums.get(endIndex) - prefixSums.get(startIndex - 1);
        }
    }

    public List<Double> getData() {
        return data;
    }

    public List<Double> getPrefixSums() {
        return prefixSums;
    }
}
