package lab3;

public class ZadaniaOd2 {
    public static void main(String[] args) {
        String numString = String.format("%d", 150);
        System.out.println("Numer skonwertowany na String: " + numString);

        int numInteger = Integer.parseInt(numString);
        System.out.printf("Skonwertowany na numer: %d\n", numInteger);

        long numLong = Long.parseLong("100000000000000");
        System.out.printf("String skonwertowany na long: %d\n", numLong);

        float numFloat = Float.parseFloat("3.14");
        System.out.printf("String skonwertowany na float: %f\n", numFloat);

        double numDouble = Double.parseDouble("3.14");
        System.out.printf("String skonwertowany na double: %f\n", numDouble);
    }
}
