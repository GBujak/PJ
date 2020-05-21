package lab9;

import java.util.*;

class Osoba implements Comparable<Osoba>{
    public String imie;
    public int wiek;
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        Osoba.equalCount++;
        if (this == o) return true;
        if (!(o instanceof Osoba)) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek &&
                Objects.equals(imie, osoba.imie);
    }

    @Override
    public int hashCode() {
        Osoba.hashCount++;
        return Objects.hash(imie, wiek);
    }

    @Override
    public int compareTo(Osoba osoba) {
        Osoba.comparedCount++;
        int imionaWynik = this.imie.compareTo(osoba.imie);
        int wiekWynik = this.wiek - osoba.wiek;

        if (imionaWynik == 0) return wiekWynik;
        else return imionaWynik;
    }

    static int comparedCount = 0;
    static int hashCount = 0;
    static int equalCount = 0;

    public static void resetCounters() {
        comparedCount = 0;
        hashCount = 0;
        equalCount = 0;
    }

    public static void printAndReset() {
        System.out.println("compare: " + comparedCount);
        System.out.println("hash:    " + hashCount);
        System.out.println("equal:   " + equalCount);
        resetCounters();
    }
}

public class ZadaniaOd3 {
    public static void main(String[] args) {
        var osoby = new ArrayList<Osoba>();
        osoby.add(new Osoba("Jan Kowalski", 40));
        osoby.add(new Osoba("Jędrzej Syn Cieśli", 22));
        osoby.add(new Osoba("Adam Nowak", 22));
        osoby.add(new Osoba("Adam Nowak", 50));
        osoby.add(new Osoba("ZZZZZZZ", 1));
        osoby.sort(Comparator.naturalOrder());
        for (var i : osoby) System.out.println(i.imie + " " + i.wiek);
        Osoba.printAndReset();

        System.out.println("========================================");

        var treeSet = new TreeSet<Osoba>();
        for (var o : osoby) treeSet.add(o);
        for (var o : osoby) treeSet.contains(o);
        System.out.println("treeSet");
        Osoba.printAndReset();

        var hashSet = new HashSet<Osoba>();
        for (var o : osoby) hashSet.add(o);
        for (var o : osoby) hashSet.contains(o);
        System.out.println("hashSet");
        Osoba.printAndReset();

        var treeMap = new TreeMap<Osoba, Integer>();
        for (var o : osoby) treeMap.put(o, o.wiek);
        for (var o : osoby) treeMap.get(o);
        System.out.println("treeMap");
        Osoba.printAndReset();

        var hashMap = new HashMap<Osoba, Integer>();
        for (var o : osoby) hashMap.put(o, o.wiek);
        for (var o : osoby) hashMap.get(o);
        System.out.println("hashMap");
        Osoba.printAndReset();

        /*
            treeSet
                compare: 20
                hash:    0
                equal:   0
            hashSet
                compare: 0
                hash:    10
                equal:   0
            treeMap
                compare: 20
                hash:    0
                equal:   0
            hashMap
                compare: 0
                hash:    10
                equal:   0
         */
    }
}
