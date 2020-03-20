package lab3;

public class ZadaniaOd13 {
    static boolean func1(boolean ret) {
        System.out.println("func1 wywołana");
        return ret;
    }

    static boolean func2(boolean ret) {
        System.out.println("func2 wywołana");
        return ret;
    }

    public static void main(String[] args) {
        if (func1(true) || func2(false))
            System.out.println(true);
        else System.out.println(false);
        // func1 wywołana
        // true

        if (func1(false) && func2(true))
            System.out.println(true);
        else System.out.println(false);
        // func1 wywołana
        // false
    }
}
