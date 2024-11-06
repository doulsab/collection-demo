package com.dd.demo.leetcode;

public class DeleteConsecutiveChar {
    public static void main(String[] args) {
        String del = "leeetCooodeee";
        // Need to delete consecutive characters

        StringBuilder usedBuilder = new StringBuilder(del);

        // Iterate through the string to check for sequences of three or more consecutive identical characters
        for (int i = 0; i < usedBuilder.length() - 2; i++) {
            // If three consecutive characters are identical, remove extra ones
            if (usedBuilder.charAt(i) == usedBuilder.charAt(i + 1) && usedBuilder.charAt(i + 1) == usedBuilder.charAt(i + 2)) {
                // Delete the third character in the sequence, leaving only two characters
                usedBuilder.deleteCharAt(i);
                i--; // Adjust the index to check the new character after deletion
            }
        }

        // Print the modified string
        System.out.println(usedBuilder);
    }
}
