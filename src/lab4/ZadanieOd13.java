package lab4;

import java.util.Arrays;

public class ZadanieOd13 {
    public static void main(String[] args) {
        var arr1 = new int[] {1, 2, 3};
        var arr2 = new int[] {1, 2, 3};

        var bigArr1 = new int[][] {arr1};
        var bigArr2 = new int[][] {arr2};

        System.out.println(
                Arrays.equals(bigArr1, bigArr2)
        );
        // false

        System.out.println(
                Arrays.deepEquals(bigArr1, bigArr2)
        );
        // true

        /*
            Porównywanie głębokie sprawdza zawartość tablic zawartych
            w porównywanych tablicach. Płytkie - tylko wskaźniki
            na zawarte w tablicach tablice.
         */
    }
}
