package lab8;

import java.io.Serializable;
import java.util.Arrays;

class Punkt implements Serializable, Cloneable, Comparable<Punkt> {
    public int x;

    public Punkt(int x) {
        this.x = x;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Punkt punkt) {
        return x - punkt.x;
    }
}

public class ZadaniaOd8 {
    public static void main(String[] args) {
        var pkt = new Punkt(100);
        Punkt pkt2 = null;
        try {
            pkt2 = (Punkt) pkt.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        pkt.x = 0;
        System.out.println(pkt2.x); // 100 OK

        var list = new Punkt[20];
        for (int i = 0; i < 20; i++)
            list[list.length - (i + 1)] = new Punkt(i);

        for (var i : list) System.out.printf("%d, ", i.x);
        System.out.println();

        Arrays.sort(list);

        for (var i : list) System.out.printf("%d, ", i.x);
        System.out.println();

        System.out.println(Arrays.binarySearch(list, new Punkt(7)));
        // 7 - zgadza się
    }
}
