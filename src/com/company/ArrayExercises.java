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

    public int getSmallestAdditionWithNumberMissing(int[] array) {
        int largestValue = getMax(array);
        int sum = sumArray(array);
        int smallestCombo = sum - largestValue;
        return smallestCombo;
    }

    public int getLargestAdditionWithNumberMissing(int[] array) {
        int smallestValue = getMin(array);
        int sum = sumArray(array);
        int smallestCombo = sum - smallestValue;
        return smallestCombo;
    }


    public int getSmallestAdditionWithNumberMissing2(int[] array) {
        int smallestCombo = Integer.MAX_VALUE;
        int[] combinationArray = new int[array.length];
        int tempSum = 0;
        for (int i = 0; i < array.length; i++) {
            tempSum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            int smallestCombinationWithoutCurrentNumber = tempSum - array[i];
            System.out.println(smallestCombinationWithoutCurrentNumber);
            combinationArray[i] = smallestCombinationWithoutCurrentNumber;
            if (smallestCombo > combinationArray[i]) {
                smallestCombo = combinationArray[i];
            }
        }
        return smallestCombo;
    }

}
