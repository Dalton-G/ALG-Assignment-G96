import Algorithms.Algorithm;
import Algorithms.BruteForce;
import Algorithms.PrefixSum;
import TestCases.InvestmentDataMonth;
import TestCases.InvestmentDataWeek;
import TestCases.InvestmentDataYear;
import Benchmark.SpaceComplexityAgent;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Load Investment Data from Test Cases
        List<Double> data = InvestmentDataMonth.getDailyReturns();
        List<List<Integer>> queries = InvestmentDataMonth.getQueries();

        // Init both Algorithms using Bridge Pattern
        Algorithm bruteForce = new Algorithm(new BruteForce(data));
        Algorithm prefixSum = new Algorithm(new PrefixSum(data));

        // Measure memory usage before running the algorithms
        measureMemoryUsage(bruteForce, prefixSum);

        // Brute Force Results (with timer)
        long runBruteForce = runQueries(bruteForce, queries, "Brute Force: ");

        // Spacer
        System.out.println();

        // Prefix Sum Results (with timer)
        long runPrefixSum = runQueries(prefixSum, queries, "Prefix Sum: ");

        // Comparison
        System.out.println("\n" + "Comparison:");
        System.out.println("Brute Force Execution Time: " + runBruteForce + " ns");
        System.out.println("Prefix Sum Execution Time: " + runPrefixSum + " ns");
        System.out.println("Difference in Exec Time: " + ((int) runBruteForce - (int) runPrefixSum) + " ns");
    }

    private static long runQueries(Algorithm algorithm, List<List<Integer>> queries, String title) {
        System.out.println(title);

        List<Double> results = new ArrayList<>();
        List<String> timeTaken = new ArrayList<>();
        long totalTime = 0;

        for (List<Integer> query : queries) {
            int start = query.get(0);
            int end = query.get(1);

            long startTime = System.nanoTime();
            double result = Math.round(algorithm.getTotalReturns(start, end) * 100.00) / 100.00;
            long endTime = System.nanoTime();

            long duration = endTime - startTime;
            totalTime += duration;

            timeTaken.add(duration + " ns");
            results.add(result);
        }

        System.out.println("Result: " + results);
        System.out.println("Time Taken: " + timeTaken);
        System.out.println("Total Time: " + totalTime + " ns");
        return totalTime;
    }
    private static void measureMemoryUsage(Algorithm bruteForce, Algorithm prefixSum) {
        System.out.println("\nMemory Usage:");

        // Get the actual BruteForce and PrefixSum instances
        BruteForce bfInstance = (BruteForce) bruteForce.getImplementation();
        PrefixSum psInstance = (PrefixSum) prefixSum.getImplementation();

        // Measure BruteForce memory usage
        long bruteForceSize = SpaceComplexityAgent.getObjectSize(bfInstance) +
                SpaceComplexityAgent.getObjectSize(bfInstance.getData());

        // Measure PrefixSum memory usage
        long prefixSumSize = SpaceComplexityAgent.getObjectSize(psInstance) +
                SpaceComplexityAgent.getObjectSize(psInstance.getData()) +
                SpaceComplexityAgent.getObjectSize(psInstance.getPrefixSums());

        System.out.println("BruteForce total size: " + bruteForceSize + " bytes");
        System.out.println("PrefixSum total size: " + prefixSumSize + " bytes");

        bfInstance.getData().forEach(d-> System.out.println(d.toString()));
        System.out.println("--------------------------------------------------------");
        psInstance.getData().forEach(d-> System.out.println(d.toString()));
        System.out.println("--------------------------------------------------------");
        psInstance.getPrefixSums().forEach(d-> System.out.println(d.toString()));


    }
}