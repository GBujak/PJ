package lab4;

class Initialization {
    static {
        System.out.println("static initialization");
    }
    {
        System.out.println("instance initialization");
    }
}

class InitializationAndConstructor {
    InitializationAndConstructor() {
        System.out.println("Constructor");
    }
    {
        System.out.println("Initialization");
    }
}

class Finalization {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalization");
    }
}

public class ZadaniaOd3 {
    public static void main(String[] args) {
        // Zadanie 3
        new Initialization();
        new Initialization();
        new Initialization();
        new Initialization();
        // static initialization
        // instance initialization
        // instance initialization
        // instance initialization
        // instance initialization

        // Zadanie 4
        new InitializationAndConstructor();
        // Initialization
        // Constructor

        // Zadanie 5
        new Finalization();
        System.gc();
        // Finalization

        // Zadanie 6
        /*
            Garbage collector zostaje uruchomiony, gdy wirtualna maszyna
            Javy stwierdzi, że w pamięci kończy się miejsce na nowe obiekty
         */

        // Zadanie 7
        /*
            Przy ręcznym wywołaniu garbage collector usuwa pamięć na stercie,
            do której nie ma żadniego wskaźnika na stosie
         */
    }
}
