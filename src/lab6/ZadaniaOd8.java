package lab6;

import lab6.strukturaKlas.Bazowa;
import lab6.strukturaKlas.Pochodna;

public class ZadaniaOd8 {
    public static void main(String[] args) {
        new Bazowa().drukujInt();
        new Bazowa(100).drukujInt();

        var pochodna = new Pochodna();
        pochodna.drukujInt();
        pochodna = new Pochodna(100, 200);
        pochodna.drukujInt();
        // pochodne: 2
        // bazowe: 1
        // pochodne: 200
        // bazowe: 100
    }
}
