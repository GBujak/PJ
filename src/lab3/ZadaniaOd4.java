package lab3;

import java.util.ArrayList;

public class ZadaniaOd4 {
    public static void main(String[] args) {
        // Zadanie 4
        if (true)  System.out.println("true");  // true

        if (false) System.out.println("false"); // - nie wydrukowane -
        else System.out.println("not false");   // not false


        for (int i = 0; i < 5; i++) {
            System.out.printf("iteracja %d: (i < 5) == %b\n", i, i < 5);
        }
        // iteracja 0: (i < 10) == true
        // iteracja 1: (i < 10) == true
        // iteracja 2: (i < 10) == true
        // iteracja 3: (i < 10) == true
        // iteracja 4: (i < 10) == true
        // iteracja 5: (i < 10) == true
        // iteracja 6: (i < 10) == true
        // iteracja 7: (i < 10) == true
        // iteracja 8: (i < 10) == true
        // iteracja 9: (i < 10) == true

        { // blok kodu, żeby zmienna "i" przestała istnieć po wykonaniu pętli
            int i = 0;
            while (i < 5) {
                System.out.printf("iteracja %d: (i < 5) == %b\n", i, i < 5);
                i++;
            }
            // to samo, co pętla for powyżej
        }



        // Zadanie 5
        var list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) list.add(i);

        for (int i : list) System.out.println(i);
        // 0
        // 1
        // 2
        // 3
        // 4

        var stringList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) stringList.add(
                String.format("String %d", i)
        );

        for (String i : stringList) System.out.println(i);
        // String 0
        // String 1
        // String 2
        // String 3
        // String 4



        // Zadanie 6
        for (int i = 0; i < 5; i++) {
            String str = (i % 2 == 0) ? "parzysta" : "nieparzysta";
            System.out.printf("Liczba %d jest %s\n", i, str);
        }
        // Liczba 0 jest parzysta
        // Liczba 1 jest nieparzysta
        // Liczba 2 jest parzysta
        // Liczba 3 jest nieparzysta
        // Liczba 4 jest parzysta
    }
}
