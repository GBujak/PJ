package lab3;

public class ZadaniaOd14 {
    public static void main(String[] args) {
        if (args.length != 2)
            throw new IllegalArgumentException(
                    "Podaj 2 argumenty"
            );

        var a = Integer.parseInt(args[0]);
        var b = Integer.parseInt(args[1]);

        System.out.printf("Suma to %d\n", a + b);

        // java lab3.ZadaniaOd14 10 20
        // Suma to 30
    }
}
