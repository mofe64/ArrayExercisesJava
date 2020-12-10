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

    public int getLargestPossibleCombination2(int[] array) {
        int largestPossibleCombo = Integer.MIN_VALUE;
        int tempSum = sumArray(array);
        for (int i = 0; i < array.length; i++) {
            int possibleCombination = tempSum - array[i];
            if (largestPossibleCombo < possibleCombination) {
                largestPossibleCombo = possibleCombination;
            }
        }
        return largestPossibleCombo;
    }

    public int[] sortArrayIncrementing(int[] array) {
        System.out.println("Original array values are 10,3,4,23,2000,100,7,1,300,-1,7900,-19,0");
        for (int i = 0; i < array.length; i++) {
            System.out.println("first loop running");
            for (int j = i + 1; j < array.length; j++) {
                System.out.println("inner loop running");
                System.out.println("if " + array[i] + " is greater than " + array[j]);
                if (array[i] > array[j]) {
                    System.out.println("temporary value store is " + array[i]);
                    int temp = array[i];
                    System.out.println("array at the " + i + " index position is currently " + array[i] + "and we switch it with " + array[j]);
                    array[i] = array[j];
                    System.out.println("array at the " + j + " index position is now changed to " + temp);
                    array[j] = temp;
                }
            }
        }
//        for (int i : array) {
//            System.out.println(i);
//        }
        return array;
    }

}
