package com.ahmadabuhasan.interview;

public class CodingTest {

    public static void main(String[] args) {
        /*Ada 2 array of Integer yang memiliki panjang yang berbeda, dan tidak berurutan.
        Buatkan program yang bisa menampilkan elemen-elemen yang sama dari dua array tersebut.
        Contoh:
        array_1 = [1, 2, 3, 4, 10, 20, 30, 100, 200, 300, 400, 1000, 2000, 3000]
        array_2 = [3, 15, 5, 6, 8, 9, 11, 12, 13, 4]
        Untuk contoh di atas, output yang dihasilkan adalah: [3, 4]*/

        test();
    }

    private static void test() {
        int[] array_1 = new int[]{1, 2, 3, 4, 10, 20, 30, 100, 200, 300, 400, 1000, 2000, 3000};
        int[] array_2 = new int[]{3, 15, 5, 6, 8, 9, 11, 12, 13, 4};
        for (int i = 0; i < array_1.length; i++) {
            for (int j = 0; j < array_2.length; j++) {
                if (array_1[i] == array_2[j]) {
                    System.out.print(array_1[i] + " ");
                }
            }
        }
    }
}
