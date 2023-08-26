package com.example.processor;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveCharactersProcessorTest {
    
    @Test
    public void testRemoveConsecutiveDuplicates() {
        // Test case with 3 consecutive identical characters
        String input1 = "aabcccbbad";
        String expected1 = "d";
        String processedString1 = ConsecutiveCharactersProcessor.removeConsecutiveDuplicates(input1);
        Assert.assertEquals(expected1, processedString1);
        
        // Test case with no consecutive identical characters
        String input2 = "abcdefg";
        String expected2 = "abcdefg";
        String processedString2 = ConsecutiveCharactersProcessor.removeConsecutiveDuplicates(input2);
        Assert.assertEquals(expected2, processedString2);
        
        // Test case with more than 3 consecutive identical characters
        String input3 = "aaabbbccc";
        String expected3 = "";
        String processedString3 = ConsecutiveCharactersProcessor.removeConsecutiveDuplicates(input3);
        Assert.assertEquals(expected3, processedString3);
        
        // Test case with consecutive characters at the beginning
        String input4 = "aaabcde";
        String expected4 = "bcde";
        String processedString4 = ConsecutiveCharactersProcessor.removeConsecutiveDuplicates(input4);
        Assert.assertEquals(expected4, processedString4);
        
        // Test case with consecutive characters at the end
        String input5 = "abcddeee";
        String expected5 = "abcd";
        String processedString5 = ConsecutiveCharactersProcessor.removeConsecutiveDuplicates(input5);
        Assert.assertEquals(expected5, processedString5);
    }
    
    @Test
    public void testReplaceConsecutiveWithPrevious() {
        // Test case with 3 consecutive identical characters
        String input1 = "abcccbad";
        String expected1 = "d";
        String processedString1 = ConsecutiveCharactersProcessor.replaceConsecutiveWithPrevious(input1);
        Assert.assertEquals(expected1, processedString1);
        
        // Test case with no consecutive identical characters
        String input2 = "abcdefg";
        String expected2 = "abcdefg";
        String processedString2 = ConsecutiveCharactersProcessor.replaceConsecutiveWithPrevious(input2);
        Assert.assertEquals(expected2, processedString2);
        
        // Test case with more than 3 consecutive identical characters
        String input3 = "aaabbbccc";
        String expected3 = "";
        String processedString3 = ConsecutiveCharactersProcessor.replaceConsecutiveWithPrevious(input3);
        Assert.assertEquals(expected3, processedString3);
        
        // Test case with consecutive characters at the beginning
        String input4 = "aaabcde";
        String expected4 = "ade";
        String processedString4 = ConsecutiveCharactersProcessor.replaceConsecutiveWithPrevious(input4);
        Assert.assertEquals(expected4, processedString4);
        
        // Test case with consecutive characters at the end
        String input5 = "abcddeee";
        String expected5 = "abcdded";
        String processedString5 = ConsecutiveCharactersProcessor.replaceConsecutiveWithPrevious(input5);
        Assert.assertEquals(expected5, processedString5);
        
        // Test case with consecutive characters that need replacement
        String input6 = "aaacccbbdd";
        String expected6 = "b";
        String processedString6 = ConsecutiveCharactersProcessor.replaceConsecutiveWithPrevious(input6);
        Assert.assertEquals(expected6, processedString6);
    }
}
