package com.example.transform;

public class PalindromeChecker {

    boolean isPalindrome(String text) {
        // TODO: implement here
        // TIP: you can use StringBuilder.reverse method

        StringBuilder builder = new StringBuilder(text);
        String reversed = builder.reverse().toString();
        return text.equals(reversed);
    }
}
