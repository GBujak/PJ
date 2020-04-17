package lab6;

import lab6.strukturaKlas.Pochodna;

import java.util.ArrayList;
import java.util.List;

public class ZadaniaOd7 {
    public static void main(String[] args) {
        System.out.println(
                new ArrayList<Integer>() instanceof List
        ); // true

        System.out.println(
                "" instanceof String
        ); // true

        System.out.println(
                new Pochodna() instanceof Object
        ); // true
    }
}
