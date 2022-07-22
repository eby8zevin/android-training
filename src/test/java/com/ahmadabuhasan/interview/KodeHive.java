package com.ahmadabuhasan.interview;

public class KodeHive {

    public static void main(String[] args) {

        System.out.println("""
                0 KH
                1 1 KH
                2 2 2 KH
                3 3 3 3 KH
                4 4 4 4 4 KH
                5 5 5 5 5 5 KH""");
        System.out.println();

        for (int a = 0; a < 6; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print(a + " ");
            }
            System.out.println(a + " KH");
        }
    }
}