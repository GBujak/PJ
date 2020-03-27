package lab4;

import java.util.Arrays;

public class ZadaniaOd14 {
    public static void main(String[] args) {
        var arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr.length - (i + 1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println("znaleziono 5 na indeksie " + i);
            }
        }


        System.out.println(
                Arrays.toString(arr)
        );

        Arrays.sort(arr);

        System.out.println(
                Arrays.toString(arr)
        );


        System.out.println(
                Arrays.binarySearch(arr, 5)
        );
        // 5

        System.out.println(
                Arrays.toString(
                    Arrays.stream(arr)
                        .filter(x -> x % 2 == 0)
                        .toArray()
                )
        );
        // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
    }
}
