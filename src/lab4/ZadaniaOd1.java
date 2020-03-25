package lab4;

class Test {
    public Test() {
        System.out.println("Bez parametrów");
    }
    public Test(String param) {
        System.out.println("Z parametrem: " + param);
    }
}

class Test2 {
    Test2(int x) {}
}

class Test3 {}

public class ZadaniaOd1 {
    public static void main(String[] args) {
        // Zadanie 1
        var test = new Test();
        test = new Test("test");
        // Bez parametrów
        // Z parametrem: test

        // Zadanie 2
        // var test2 = new Test2(); <- Błąd
        var test3 = new Test3(); // OK
    }
}
