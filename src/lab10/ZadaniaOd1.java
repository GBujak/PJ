package lab10;

// Zadanie 1
class MyException extends Exception {
    public void myPrint() {
        System.out.println("MyException");
    }
}

class MyChildException extends MyException {
    public void myPrint() {
        System.out.println("MyChildException");
    }
}

public class ZadaniaOd1 {
    // Zadanie 4
    static void throwingFunction() throws MyException {
        throw new MyChildException();
    }

    // Zadanie 8
    static void runtimeThrowingFunction() { // nie trzeba pisać "throws"
        throw new RuntimeException();
    }

    // Zadanie 10
    static void recursiveThrowingFunction(int x) throws MyException {
        if (x < 20) recursiveThrowingFunction(x + 1);
        else throw new MyException();
    }

    public static void main(String[] args) {
        // Zadanie 2 i 3
        try {
            throwingFunction();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  lab10.MyException
        //	  at lab10.ZadaniaOd1.throwingFunction(ZadaniaOd1.java:13)
        //	  at lab10.ZadaniaOd1.main(ZadaniaOd1.java:19)

        // Zadanie 5
        /* try {
            throwingFunction();
        } catch (MyException e) {
            e.myPrint();
        } catch (MyChildException e) { // nie kompiluje się
            e.myPrint();               // "already caught"
        } */

        try {
            throwingFunction();
        } catch (MyChildException e) {
            e.myPrint();
        } catch (MyException e) { // OK - kompiluje się
            e.myPrint();
        }

        // Zadanie 6
        // Są wyrzucane w metodzie, która wywołała tą metodę

        // Zadanie 7
        // Metoda, w której wystąpił wyjątek jest przerywana i nie może
        // zwrócić żadniej wartości

        // Zadanie 8
        // runtimeThrowingFunction();
        // nie trzeba przechwytywać

        // Zadanie 9
        try {
            throwingFunction();
        } catch (Exception e) {
        } finally {
            System.out.println("finally");
        }

        // Zadanie 10
        // Ta metoda drukuje funkcje, jakie były na stosie w momencie
        // stworzenia obiektu wyjątku
        try {
            recursiveThrowingFunction(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  lab10.MyException
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:30)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.recursiveThrowingFunction(ZadaniaOd1.java:29)
        //	  at lab10.ZadaniaOd1.main(ZadaniaOd1.java:82)

        // Zadanie 11
        try {
            try {
                throwingFunction();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
