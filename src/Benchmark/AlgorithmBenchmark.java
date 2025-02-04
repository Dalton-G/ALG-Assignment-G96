package Benchmark;

import Algorithms.Algorithm;
import Algorithms.BruteForce;
import Algorithms.PrefixSum;
import TestCases.InvestmentDataGenerator;
import org.openjdk.jmh.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)

public class AlgorithmBenchmark {

    @Param({"10", "100", "1000", "10000", "100000", "1000000"})
    private int numDays;

    @Param({"100"})
    private int numQueries;

    private Algorithm bruteForce;
    private Algorithm prefixSum;
    private List<List<Integer>> queries;

    @Setup
    public void setup() {
        List<Double> data = InvestmentDataGenerator.generateDailyReturns(numDays);
        queries = InvestmentDataGenerator.generateQueries(numQueries, numDays);
        bruteForce = new Algorithm(new BruteForce(data));
        prefixSum = new Algorithm(new PrefixSum(data));
    }

    @Benchmark
    public void benchmarkBruteForce() {
        for (List<Integer> query : queries) {
            int start = query.get(0);
            int end = query.get(1);
            bruteForce.getTotalReturns(start, end);
        }
    }

    @Benchmark
    public void benchmarkPrefixSum() {
        for (List<Integer> query : queries) {
            int start = query.get(0);
            int end = query.get(1);
            prefixSum.getTotalReturns(start, end);
        }
    }
}
