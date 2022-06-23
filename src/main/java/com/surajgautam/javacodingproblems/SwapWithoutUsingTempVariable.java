package com.surajgautam.javacodingproblems;

public class SwapWithoutUsingTempVariable {
    public static void main(String[] args) {

        swap(5, 8);

    }

    private static void swap(int firstValue, int secondValue) {
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;
        System.out.println(firstValue);
        System.out.println(secondValue);
    }
}
