package lab6.strukturaKlas;

public class Pochodna extends Bazowa {
    public int poleInt = 2;
    public void drukujInt() {
        System.out.println(
                "pochodne: " + poleInt
                + "\nbazowe: " + super.poleInt
        );
    }

    public static String poleStaticString =
            "Pole klasy pochodnej";
    public static void drukujStaticString() {
        System.out.println(poleStaticString);
    }

    public Pochodna() {}
    public Pochodna(int bazoweInt, int poleInt) {
        super(bazoweInt);
        this.poleInt = poleInt;
    }
}
