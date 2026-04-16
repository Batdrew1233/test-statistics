package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        //Test Score Array
        int[] testScores = {90, 65, 84, 71, 96, 74, 57, 68, 98, 88};

        //variable to keep track of sum
        int sum = 0;

        //Goes through each test score and adds it to sum
        for (int testScore : testScores) {
            sum += testScore;

        }
        System.out.println("The Average is " + sum/ testScores.length + "%");

        //Calculate High Score
        int highest = testScores[0];
        for (int score : testScores){
            if(score > highest)
                highest = score;
        }
        // Print out highest score
        System.out.println("Highest Score: " + highest);



    }
}
