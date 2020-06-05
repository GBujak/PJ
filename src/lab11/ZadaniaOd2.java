package lab11;

import java.io.*;

class MyClass implements Serializable {
    private int x, y;
    private String str;
    public MyClass(int x, int y, String str) {
        this.x = x;
        this.y = y;
        this.str = str;
    }
    public void print() {
        System.out.println(x + " " + y + " " + str);
    }
}

public class ZadaniaOd2 {
    public static void main(String[] args) {
        var file = new File("myFile.txt");
        try {
            // Zadanie 2
            if (!file.exists()) file.createNewFile();
            var writer = new PrintWriter(new FileWriter(file));
            for (int i = 0; i < 10; i++)
                writer.println(i);
            writer.close();
            var reader = new BufferedReader(new FileReader(file));
            reader.lines().forEach(
                    str -> System.out.println(
                            Integer.parseInt(str.trim())
                    )
            );

            // Zadanie 3
            file.delete();
            file.createNewFile();
            var objWriter = new ObjectOutputStream(new FileOutputStream(file));
            objWriter.writeObject(new MyClass(5, 10, "Hello"));
            objWriter.close();

            var objReader = new ObjectInputStream(new FileInputStream(file));
            MyClass myClass = null;
            try {
                var obj = objReader.readObject();
                myClass = (MyClass) obj;
            } catch (Exception e) { e.printStackTrace(); }
            if (myClass != null)
                myClass.print();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
