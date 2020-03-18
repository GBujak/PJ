package lab3;

public class ZadaniaOd9 {
    public static void main(String[] args) {
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && false); // false
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || false); // false

        System.out.println(5 + 5); // 10
        System.out.println(5 * 5); // 25
        System.out.println(5 / 5); // 1



        // Zadanie 10
        System.out.println(1 + 2 * 3); // 7



        // Zadanie 11
        var str1 = new String();
        var str2 = new String();
        System.out.printf("(str1 == str2): %b\n", str1 == str2); // false
        System.out.printf("(str1.equals(str2)): %b\n", str1.equals(str2)); // true
        // "==" porównuje adres pamięci obiektu, "equals" - przechowywane dane



        // Zadanie 12
        System.out.println((double)(float)(long)(int) 100);   // 100.0
        System.out.println((int)(long)(float)(double) 100.1); // 100
    }
}
