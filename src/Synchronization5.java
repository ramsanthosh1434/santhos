
class Synchronization1 {

  static synchronized void m1(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * n);

        }
        try {
            Thread.sleep(100);

        } catch (Exception ae) {
            ae.printStackTrace();
        }
    }
}

/*class Synchronization2 {

    static synchronized void m2(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * n);

        }
        try {
            Thread.sleep(100);

        } catch (Exception ae) {
            ae.printStackTrace();
        }
    }
}*/

class Sync1 extends Thread {

    Synchronization1 s;

    Sync1(Synchronization1 s) {
        this.s = s;
    }

    public void run() {
        s.m1(0);
    }
}

class Sync2 extends Thread {

    Synchronization1 s1;

    Sync2(Synchronization1 s1) {
        this.s1 = s1;

    }

    public void run() {
        s1.m1(2);
    }
}

public class Synchronization5 {

    public static void main(String args[]) {
        Synchronization1 ob = new Synchronization1();

        Sync1 ob1 = new Sync1(ob);
       // Synchronization2 ob2 = new Synchronization2();
        Sync2 ob3 = new Sync2(ob);
        ob1.start();
        ob3.start();
    }
}
