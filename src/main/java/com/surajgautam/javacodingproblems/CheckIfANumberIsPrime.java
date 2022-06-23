package com.surajgautam.javacodingproblems;

public class CheckIfANumberIsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
        System.out.println(isPrime(13));

    }

    private static boolean isPrime(final int value) {
        if (value == 0 || value == 1) return false;
        for (int i = 2; i < value/2; i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
