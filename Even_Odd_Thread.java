import java.lang.Thread;

class checkEven extends Thread {
    public void run() {
        int n=20;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number from evenThread : " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}

class checkOdd extends Thread {
    public void run() {
        int n=20;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number rom OddThread : " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
            }
        }

    }
}

public class Even_Odd_Thread {
    public static void main(String[] args) {
        checkEven obj1 = new checkEven();
        checkOdd obj2 = new checkOdd();
        obj1.start();
        obj2.start();
    }
}