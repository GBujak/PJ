package lab8;

import java.sql.SQLOutput;

abstract class Abstrakcyjna {
    String val = "tekst";
    public abstract void func();
}

interface Interfejs {
    void metodaInterfejsu();
}

class Pochodna
        extends Abstrakcyjna
        implements Interfejs {

    public void func() {
        System.out.println(this.val);
    }
    public void metodaInterfejsu() {
        func();
    }
}

interface Interfejs2 extends Interfejs {
    void metodaInterfejsu2();
}

class Pochodna2 implements Interfejs2 {
    public void metodaInterfejsu()  {}
    public void metodaInterfejsu2() {}
}

public class ZadaniaOd1 {
    public static void main(String[] args) {
        var klasa = new Pochodna();
        klasa.metodaInterfejsu();
        ((Interfejs) klasa).metodaInterfejsu(); // to samo

        // anonimowy objekt
        new Pochodna().metodaInterfejsu();

        var anonimowaKlasa = new Interfejs() {
            public void metodaInterfejsu() {
                System.out.println("klasa anonimowa");
            }
        };
        anonimowaKlasa.metodaInterfejsu();
    }
}
