package com.example.processor;

import java.util.Stack;

/**
 * This class provides methods to process consecutive characters in a string.
 */
public class ConsecutiveCharactersProcessor {

    /**
     * Removes consecutive duplicates from a given string.
     *
     * @param input The input string.
     * @return The string with consecutive duplicates removed.
     */
    public static String removeConsecutiveDuplicates(String input) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : input.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != ch) {
                stack.push(ch);
            } else {
                int count = 1;
                while (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                    count++;
                }
                if (count < 3) {
                    for (int i = 0; i < count; i++) {
                        stack.push(ch);
                    }
                }
            }
        }
        
        return stackToString(stack);
    }
    
    /**
     * Replaces consecutive characters with the previous character in the alphabet.
     *
     * @param input The input string.
     * @return The string with consecutive characters replaced.
     */
    public static String replaceConsecutiveWithPrevious(String input) {
        Stack<Character> stack = new Stack<>();
        int i =0;
        for (char ch : input.toCharArray()) {
        	i++;
            if (stack.isEmpty() || stack.peek() != ch) {
                stack.push(ch);
            } else {
                int count = 1;
                while (!stack.isEmpty() && stack.peek() == ch) {
                    //stack.pop();
                    count++;
                }
                if (count >= 3) {
                	stack.pop();
                	stack.pop();
                    stack.push((char) (ch - 1));
                } else {
                    stack.push(ch);
                }
            }
        }
        
        return stackToString(stack);
    }
    
    /**
     * Converts a stack of characters to a string.
     *
     * @param stack The stack of characters.
     * @return The concatenated string.
     */
    private static String stackToString(Stack<Character> stack) {
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }
}
