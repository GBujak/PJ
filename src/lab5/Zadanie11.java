package lab5;

public class Zadanie11 {
    public lab5.innyPakiet.innaKlasa x
            = new lab5.innyPakiet.innaKlasa(); // OK

    public static void main(String[] args) {
        System.out.println(new Zadanie11().x);
        // lab5.innyPakiet.innaKlasa@5fd0d5ae
    }
}
