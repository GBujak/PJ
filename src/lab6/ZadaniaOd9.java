package lab6;

class Bazowa {
    public int pub = 1;
    protected int prot = 2;
    private int priv = 3;
}

class Pochodna extends Bazowa {
    public void drukuj() {
        System.out.println(pub);
        System.out.println(prot);
        // System.out.println(priv); BŁĄD
    }
}

public class ZadaniaOd9 {
    public static void main(String[] args) {
        new Pochodna().drukuj();
    }
}

/*
    Gdy w konstruktorze nie ma super
    pola klasy bazowej mogą nie być
    zainicjalizowane
 */

/*
    Klasa nie używająca extends dziedziczy
    po wbudowanej w język Java klasie
    Object
 */