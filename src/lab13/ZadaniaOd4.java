package lab13;

import java.security.spec.ECField;
import java.util.ArrayList;

class MySynch {
    int i = 0;
    synchronized void synch() { i++; }
    void blockSynch() { synchronized (this) { i++; } }
}

class MyUnsynch {
    int i;
    void unsynch() { i++; }
}

// Zadanie 7
class ObjectSynch {
    int val = 0;
    void setVal() {
        synchronized (this) {
            val = 100;
            this.notify();
        }
    }
    void print() {
        synchronized (this) {
            try {
                this.wait();
            } catch (Exception e) { e.printStackTrace(); }
            System.out.println(val);
        }
    }
}

public class ZadaniaOd4 {
    public static void main(String[] args) {
        var synch = new MySynch();
        var blockSynch = new MySynch();
        var unsynch = new MyUnsynch();

        var threads = new ArrayList<Thread>();
        for (int i = 0; i < 4; i++)
            threads.add(new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    synch.synch();
                    blockSynch.blockSynch();
                    unsynch.unsynch();
                }
            }));
        threads.forEach(Thread::start);
        threads.forEach(t -> {
            try {
                t.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println("Wynik powinien wynosić: " + 4 * 100);
        System.out.println("    synchronizowane:         " + synch.i);
        System.out.println("    synchronizowane blokiem: " + blockSynch.i);
        System.out.println("    niesynchronizowane:      " + unsynch.i);
        // DATA RACE
        // Wynik powinien wynosić: 400
        //     synchronizowane:         400
        //     synchronizowane blokiem: 400
        //     niesynchronizowane:      383

        var objsynch = new ObjectSynch();
        var readThread = new Thread(objsynch::print);
        var writeThread = new Thread(objsynch::setVal);
        readThread.start();
        try {Thread.sleep(1000);} catch (Exception e) {}
        writeThread.start();
    }
}
