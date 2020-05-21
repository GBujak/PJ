package lab9;

import java.util.*;

public class ZadaniaOd2 {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) arrlist.add(i);
        for (var i : arrlist) System.out.println(i);

        List<Integer> linlist = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) linlist.add(i);
        for (var i : linlist) System.out.println(i);

        Set<Integer> hset = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
            if (i % 2 == 0) hset.add(i);
        for (int i = 0; i < 10; i++)
            System.out.println(hset.contains((Integer) i));

        Set<Integer> tset = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++)
            if (i % 2 == 0) tset.add(i);
        for (int i = 0; i < 10; i++)
            System.out.println(hset.contains((Integer) i));

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(100, "Jan");
        hmap.put(200, "Kowalski");
        System.out.println(
                  hmap.get(100) + " "
                + hmap.get(200) + " "
                + hmap.get(300)
        ); // Jan Kowalski null

        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(100, "Jan");
        tmap.put(200, "Kowalski");
        System.out.println(
                 tmap.get(100) + " "
               + tmap.get(200) + " "
               + tmap.get(300)
        ); // Jan Kowalski null
    }
}
