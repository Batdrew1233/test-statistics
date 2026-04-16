package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        //Test Score Array
        int[] testScores = {90, 65, 84, 71, 96, 74 };

        //variable to keep track of sum
        int sum = 0;

        //Goes through each test score and adds it to sum
        for (int testScore : testScores) {
            sum += testScore;

        }
        System.out.println("The Average is " + sum/ testScores.length + "%");
    }
}
