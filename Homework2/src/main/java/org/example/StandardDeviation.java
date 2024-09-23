package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StandardDeviation {
    public static void main(String[] args) throws IllegalArgumentException {
       int[] sampleValues = {9, 6, 8, 5, 7};
       double sampleStdDev = computeSampleStandardDeviation(sampleValues);
        System.out.println("Sample StdDev = " + sampleStdDev);


        int[] populationValues = {9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4};
        double popStdDev = computePopulationStandardDeviation(populationValues);
        System.out.println("Population StdDev = " + popStdDev);
    }

    static double computeMean(int[] values) throws IllegalArgumentException {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("values parameter cannot be null or empty");
        }
        int sumAccumulator = 0;
        for (int value : values) {
            sumAccumulator += value;
        }

        return (double) sumAccumulator / values.length;
    }
    static double computeSquareOfDifferences(int[] values, double mean) throws IllegalArgumentException {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("values parameter cannot be null or empty");
        }
        double squareAccumulator = 0;
        for (int value : values) {
            double difference = value - mean;
            double squareOfDifference = difference * difference;
            squareAccumulator += squareOfDifference;
        }
        return squareAccumulator;
    }
    static double computeVariance(double squareOfDifferences, int numValues, boolean isPopulation) throws IllegalArgumentException {
        if(!isPopulation) {
            numValues--;
        }
        if(numValues < 1) {
            throw new IllegalArgumentException("numValues is too low (sample must be >= 1, population must be >= 2)");
        }
        return squareOfDifferences / numValues;
    }


    static double computeStandardDeviation(int[] values, boolean isPopulation) throws IllegalArgumentException {
        if (values == null || values.length == 0){
            throw new IllegalArgumentException("values parameter cannot be null or empty");
        }

        double mean = computeMean(values);
        double squareOfDifferences = computeSquareOfDifferences(values, mean);
        double variance = computeVariance(squareOfDifferences, values.length, isPopulation);
        return Math.sqrt(variance);
    }



    static double computeSampleStandardDeviation(int[] values) throws IllegalArgumentException {
        return computeStandardDeviation(values, false);
    }


    static double computePopulationStandardDeviation(int[] values) throws IllegalArgumentException {
        return computeStandardDeviation(values, true);
    }





}