package Algorithms;

public class Algorithm {
    RangeSum rs;

    public Algorithm(RangeSum rs) {
        this.rs = rs;
    }

    public double getTotalReturns(int startIndex, int endIndex) {
        return rs.getTotalReturns(startIndex, endIndex);
    }

    public RangeSum getImplementation() {
        return rs;
    }
}
