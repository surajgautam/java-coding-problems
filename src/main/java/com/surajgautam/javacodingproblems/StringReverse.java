package com.surajgautam.javacodingproblems;

import java.util.Stack;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(reverseUsingForLoop("Suraj"));
        System.out.println(reverseUsingStack("Suraj"));
    }

    private static String reverseUsingForLoop(final String value) {
        throwException(value);
        char[] values = value.toCharArray();
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = values.length - 1; i >= 0; i--) {
            stringBuilder.append(values[i]);
        }
        return stringBuilder.toString();
    }

    private static String reverseUsingStack(final String value) {
        final Stack<Character> stack = new Stack<>();
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        final StringBuilder finalValue = new StringBuilder();
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            finalValue.append(stack.pop().charValue());
        }
        return finalValue.toString();
    }

    private static void throwException(String value) {
        if(value == null && value.isEmpty()) {
            throw new RuntimeException("cannot do this operation");
        }
    }

}
