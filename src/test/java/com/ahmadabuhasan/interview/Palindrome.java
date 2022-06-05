package com.ahmadabuhasan.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Palindrome {

    private boolean isPalindromeRecursive(String value, int i) {
        if (i < value.length() / 2) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
                return false;
            } else {
                return isPalindromeRecursive(value, i + 1);
            }
        } else {
            return true;
        }
    }

    public boolean isPalindrome(String value) {
        return isPalindromeRecursive(value, 0);

        /*for (int i = 0; i < value.length() / 2; i++) {
            //System.out.println(i + ": " + (value.length() - i - 1));
            int indexStart = i;
            int indexEnd = value.length() - i - 1;

            if (value.charAt(indexStart) != value.charAt(indexEnd)) {
                return false;
            }
        }
        return true;*/

        /*String temp = "";

        for (int i = value.length() - 1; i >= 0; i--) {
            temp = temp + (value.charAt(i));
        }

        System.out.println(temp);
        return temp.equals(value);*/
    }

    @Test
    void test() {
        isPalindrome("kodok");
    }

    @Test
    void testPalindrome() {
        Assertions.assertTrue(isPalindrome("a"));
        Assertions.assertTrue(isPalindrome("aba"));
        Assertions.assertTrue(isPalindrome("kodok"));
        Assertions.assertTrue(isPalindrome(""));

        Assertions.assertFalse(isPalindrome("ab"));
        Assertions.assertFalse(isPalindrome("abab"));
        Assertions.assertFalse(isPalindrome("kodcok"));
        Assertions.assertFalse(isPalindrome("eko"));
    }
}
