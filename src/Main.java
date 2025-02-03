import Algorithms.Algorithm;
import Algorithms.BruteForce;
import Algorithms.PrefixSum;
import TestCases.InvestmentDataYear;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Load Investment Data from Test Cases
        List<Double> data = InvestmentDataYear.getDailyReturns();
        List<List<Integer>> queries = InvestmentDataYear.getQueries();

        // Init both Algorithms using Bridge Pattern
        Algorithm bruteForce = new Algorithm(new BruteForce(data));
        Algorithm prefixSum = new Algorithm(new PrefixSum(data));

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
}