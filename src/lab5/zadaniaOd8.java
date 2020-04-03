package lab5;

// import lab5.pakietDoZad8.klasaNiepubliczna; BŁĄD

import lab5.pakietDoZad8.klasaDo8;
import static lab5.pakietDoZad8.klasaDo8.*;

public class zadaniaOd8 {
    public static void main(String[] args) {
        klasaDo8.poleStatyczne = 100;
        klasaDo8.metodaStatyczna();

        // Dzięki import static można też:
        poleStatyczne = 200;
        metodaStatyczna();
    }
}
