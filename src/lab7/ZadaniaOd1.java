package lab7;

import java.util.ArrayList;

class Bazowa {
    public void metoda() {
        System.out.println("metoda() z bazowej");
    }

    public final void metodaFinalna() {
        System.out.println("Finalna");
    }
}

class Pochodna extends Bazowa {
    @Override
    public void metoda() {
        System.out.println("metoda() z pochodnej");
    }

    public void metoda(int i) {
        System.out.println("metoda() z pochodnej z int " + i);
    }
}

class Pochodna2 extends Bazowa {
    @Override
    public void metoda() {
        System.out.println("metoda() z pochodnej 2");
    }
}

/*
    class TestOverride extends Bazowa {
        @Override
        public void metoda(int i) {}
    }
    BŁĄD KOMPILACJI
*/

/*
    class TestFinalna extends Bazowa {
        public void metodaFinalna() {}
    }
    BŁĄD KOMPILACJI
*/

/*
    class TestPrzeciazania {
        public void  metoda() {}
        public float metoda() {}
    }
    BŁĄD KOMPILACJI
*/

public class ZadaniaOd1 {
    public static void main(String[] args) {
        var poch = new Pochodna();
        poch.metoda();
        poch.metoda(100);
        poch.metodaFinalna();

        ((Bazowa) poch).metoda();

        var list = new Bazowa[10];
        for (int i = 0; i < 10; i++)
            list[i] = i%2 == 0
                    ? new Pochodna()
                    : new Pochodna2();

        for (var i : list) i.metoda();
    }
}

/*
    Porównywanie obiektów jest wykonywane przez
    wywołanie przeciążonej metody equals na obiekcie
 */