package com.ahmadabuhasan.interview;

public class OmegaMas {

    public static void main(String[] args) {

        String str = "OMEGA MAS";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("char at " + i + " index is: " + c);
        }

        System.out.println();

        char[] c_arr = str.toCharArray();
        for (int i = 0; i < c_arr.length; i++) {
            System.out.println("char at " + i + " index is: " + c_arr[i]);
        }
    }
}