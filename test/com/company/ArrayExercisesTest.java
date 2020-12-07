package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExercisesTest {
    ArrayExercises arrayExercises;
    @BeforeEach
    void setUp() {
        arrayExercises = new ArrayExercises();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSumArray() {
        int [] testArray = {1,2,3,4,5};
        assertEquals(15,arrayExercises.sumArray(testArray));
    }

    @Test
    void testAverageOfArray(){
        int[] testArray = {1,2,3,4,5};
        assertEquals(3,arrayExercises.getAverage(testArray));
    }

    @Test
    void testGetMin(){
        int[] testArray = {1,3,4,6,0};
        assertEquals(0, arrayExercises.getMin(testArray));
        int[] testArray2 = {748,361818,78,9,6,7};
        assertEquals(6, arrayExercises.getMin(testArray2));
    }

    @Test
    void testGetMax(){
        int[] testArray = {1,3,4,6,7,9,0};
        assertEquals(9, arrayExercises.getMax(testArray));
        int[] testArray2 =  {748,318,78,7866,6,7};
        assertEquals(7866, arrayExercises.getMax(testArray2));
    }

    @Test
    void testGetMinCombination(){
        int[] testArray = {3,6,1,3};
        assertEquals(7,arrayExercises.getSmallestPossibleCombination2(testArray));
        assertEquals(7, arrayExercises.getSmallestPossibleCombination(testArray));
    }

    @Test
    void testGetMaxCombination(){
        int[] testArray = {3,6,1,3};
        assertEquals(12, arrayExercises.getLargestPossibleCombination(testArray));
        assertEquals(12, arrayExercises.getLargestPossibleCombination2(testArray));
    }
}