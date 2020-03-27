package lab4;

class ArrTest {
    int x;
    public ArrTest(int x) {
        this.x = x;
    }
}

public class ZadaniaOd10 {
    public static void main(String[] args) {
        var arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }

        var objectArr = new ArrTest[20];
        for (int i = 0; i < objectArr.length; i++) {
            objectArr[i] = new ArrTest(i * i);
        }

        var test2 = objectArr.clone();
        for (int i = 0; i < objectArr.length; i++) {
            objectArr[i] = null;
        }

        for (int i = 0; i < test2.length; i++) {
            System.out.println(test2[i]);
        }
        // obiekty zostały skopiowane - nie są null
    }
}
