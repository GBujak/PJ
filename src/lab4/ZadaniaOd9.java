package lab4;

class ObjTest {
    int x;
    public ObjTest(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
}

public class ZadaniaOd9 {
    public static void main(String[] args) {
        var test  = new ObjTest(100);
        var test2 = new ObjTest(100);

        System.out.println(test.equals(test2));
        // false

        System.out.println(test.toString());
        // lab4.ObjTest@5fd0d5ae
    }
}
