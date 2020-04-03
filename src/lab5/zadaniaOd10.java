package lab5;

class finalTest {
    public final int x;
    public finalTest(int x) {
        this.x = x;
    }

    // public finalTest() {}; BŁĄD
    // nie może istnieć konstruktor, króry
    // nie inicjalizuje wszystkich pól finalnych!
}

public class zadaniaOd10 {
    public static void main(String[] args) {
        var x = new finalTest(100);

        // x.x = 200; BŁĄD

        System.out.println(x.x);
        // 100
    }
}
