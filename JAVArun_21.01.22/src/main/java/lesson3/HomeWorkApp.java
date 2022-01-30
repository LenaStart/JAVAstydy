package lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        massiv();
        massivDoub();

    }

    private static void massivDoub() {
         //Arrays.fill();
        int[][] b = new int[3][4];

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length; j++) {

            }
                // System.out.println(b[i]);
            }

            System.out.println(Arrays.toString(b));
        }


    private static void massiv() {
       // Arrays.fill(a, 9);
        int[] a = {1, 1, 0, 1, 0, 0, 1, 0};

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == 1) {
                int b = a[i];
                // System.out.println(a[i]);
            }

            System.out.println(Arrays.toString(a));
        }

    }
}


