package com.ahmadabuhasan.interview;

import org.junit.jupiter.api.Test;

public class ApaBole {

    public void fizzBuzz(int total) {
        for (int i = 1; i <= total; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("ApaBole");
            } else if (i % 3 == 0) {
                System.out.println("Apa");
            } else if (i % 5 == 0) {
                System.out.println("Bole");
            } else {
                System.out.println(i);
            }
        }
    }

    @Test
    void testFizzBuzz() {
        fizzBuzz(100);
    }
}
