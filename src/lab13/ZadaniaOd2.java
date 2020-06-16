package lab13;

import java.util.ArrayList;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("myRunnable skończył");
        } catch (Exception e) { e.printStackTrace(); }
    }
}

public class ZadaniaOd2 {
    public static void main(String[] args) {
        var threads = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++)
            threads.add(new Thread(new MyRunnable()));
        threads.forEach(Thread::start);
        threads.forEach(t -> {
            try { t.join(); } catch (Exception e) { e.printStackTrace(); }
        });
    }
}
