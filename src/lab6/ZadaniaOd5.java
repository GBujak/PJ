package lab6;

import lab6.strukturaKlas.Bazowa;
import lab6.strukturaKlas.Pochodna;

public class ZadaniaOd5 {
    public static void main(String[] args) {
        var pochodna = new Pochodna();
        pochodna.drukujInt(); // 2

        Bazowa bazowa = pochodna;
        bazowa.drukujInt(); // 2

        var bazowa2 = new Bazowa();
        Pochodna pochodna2;
        if (bazowa2 instanceof Pochodna)
            pochodna2 = (Pochodna) bazowa2;
        else
            System.out.println(bazowa2 instanceof Pochodna);
        // false
    }
}
