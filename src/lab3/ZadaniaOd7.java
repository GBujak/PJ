package lab3;

public class ZadaniaOd7 {
    public static void main(String[] args) {
        // Zadanie 7
        for (int i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i jest zerowe");
                    break;
                case 5:
                    System.out.println("i jest równe 5");
                    // nie ma "break" -> dla i równego 5
                    // zostanie również wydrukowane "inne i"
                default:
                    System.out.println("inne i");
            }
        }

        for (int i = 0; i < 1000; i++) {
            if (i == 2) continue;
            System.out.println(i);
            if (i == 5) break;
        }
        // 0
        // 1
        // 3
        // 4
        // 5



        // Zadanie 8
        outer:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.printf("i: %d, j: %d\n", i, j);
                if (i == 0) continue outer;
                if (j == 5) break outer;
            }
        }
        // i: 0, j: 0 <- continue outer
        // i: 1, j: 0
        // i: 1, j: 1
        // i: 1, j: 2
        // i: 1, j: 3
        // i: 1, j: 4
        // i: 1, j: 5 <- break outer
    }
}
