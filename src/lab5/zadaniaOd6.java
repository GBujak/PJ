package lab5;

class klasa1 {
    public int x;
    protected int y;
    private int z;
}

class klasa2 extends klasa1 {
    public klasa2() {
        this.x = 10;
        this.y = 20;
        // this.z = 30; BŁĄD
    }

    private int zad7int;
    public void zadanie7() {
        var x = new klasa2();
        x.zad7int = 100; // można
    }
}

public class zadaniaOd6 {
    public static void main(String[] args) {
        var x = new klasa2();
        x.x *= 10;
        x.y *= 10;
        // można bo klasa zadaniaOd6
        // i klasa2 są w tym samym pakiecie

        x.zadanie7();
    }
}
