package lab6.strukturaKlas;

public class Bazowa {
    public int poleInt = 1;
    public void drukujInt() {
        System.out.println(poleInt);
    }

    public static String poleStaticString =
            "Pole klasy bazowej";
    public static void drukujStaticString() {
        System.out.println(poleStaticString);
    }

    public Bazowa() {}
    public Bazowa(int poleInt) {
        this.poleInt = poleInt;
    }
}
