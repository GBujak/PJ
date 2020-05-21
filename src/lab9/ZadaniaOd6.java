package lab9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ZadaniaOd6 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) list.add(i);

        var iter = list.iterator();
        while (iter.hasNext()) System.out.println(iter.next());

        var set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) set.add(i);

        iter = set.iterator();
        while (iter.hasNext()) System.out.println(iter.next());
    }
}
