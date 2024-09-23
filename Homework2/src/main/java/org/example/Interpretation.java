package org.example;

public class Interpretation {
    static String interpretStandardDeviation(double stdDev){
        stdDev = Math.round(stdDev*10)/10.0;
        if(stdDev > 2.0){
            return "Above Average";
        } else if(stdDev < -2.0){
            return "Below Average";
        } else if(Math.abs(stdDev - 0.0) < 0.000001){
            return "Exactly Average";
        } else {
            return "Near Average";
        }
    }
}
