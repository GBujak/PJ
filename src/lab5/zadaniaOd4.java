package lab5;

class testKlasa {
    public int x;
    private int y;

    public testKlasa(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private testKlasa(String x) {}

    public void print() {
        System.out.println(
                "x = " + x + "; y = " + y
        );
    }

    private void test() {}
}

public class zadaniaOd4 {
    public static void main(String[] args) {
        var x = new testKlasa(10, 20);

        // x = new testKlasa("Hello")  BŁĄD

        x.x = 40;
        // x.y = 40; BŁĄD

        x.print();
        // x.test(); BŁĄD
    }
}
