package com.company;

public class ArrayExercises {
    public int sumArray(int[] numArray) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    public double getAverage(int[] scoreArray) {
        double sum = 0;
        for (int i = 0; i < scoreArray.length; i++) {
            sum += scoreArray[i];
        }
        return sum / scoreArray.length;
    }

    public int getMax(int[] scoreArray) {
        int highest = scoreArray[0];
        for (int i = 0; i < scoreArray.length; i++) {
            if (highest < scoreArray[i]) {
                highest = scoreArray[i];
            }
        }
        return highest;
    }

    public int getMin(int[] scoreArray) {
        int lowest = scoreArray[0];
        for (int i = 0; i < scoreArray.length; i++) {
            if (lowest > scoreArray[i]) {
                lowest = scoreArray[i];
            }
        }
        return lowest;
    }

    public int getSmallestPossibleCombination(int[] array) {
        return sumArray(array) - getMax(array);
    }

    public int getLargestPossibleCombination(int[] array) {
        return sumArray(array) - getMin(array);
    }


    public int getSmallestPossibleCombination2(int[] array) {
        int smallestCombo = Integer.MAX_VALUE;
        int tempSum = sumArray(array);
        for (int i = 0; i < array.length; i++) {
            int possibleCombination = tempSum - array[i];
            if (smallestCombo > possibleCombination) {
                smallestCombo = possibleCombination;
            }
        }
        return smallestCombo;
    }

    public int getLargestPossibleCombination2(int[] array){
        int largestPossibleCombo = Integer.MIN_VALUE;
        int tempSum = sumArray(array);
        for (int i=0; i < array.length; i++){
            int possibleCombination = tempSum - array[i];
            if(largestPossibleCombo < possibleCombination){
                largestPossibleCombo = possibleCombination;
            }
        }
        return largestPossibleCombo;
    }

}
