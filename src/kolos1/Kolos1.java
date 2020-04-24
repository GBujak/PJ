package kolos1;

class myClass {
    private int i;
    private float f;

    public myClass() {
        this(10, (float) 20.20);
    }

    myClass(int i, float f) {
        this.i = i;
        this.f = f;
    }
}

public class Kolos1 {
    public static void main(String[] args) {
        var table = new float[2][3];

        var mycl = new myClass();
        mycl = new myClass(100, (float) 0.124);
    }
}
