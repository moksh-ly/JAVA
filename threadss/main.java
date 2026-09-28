package threadss;
class NumberPrinter {
    private int turn = 1;      //synced output for 3 threads
    //because of wait and notifyAll methods
    public synchronized void print(int threadNumber) {
        for(int i = 1; i <= 5; i++) {
        while (turn != threadNumber) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("thread " + threadNumber + ": " + i);

        turn = (turn % 3) + 1; // Change turn to the next number
        notifyAll();
    }
    }
}
public class main {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread t1 = new Thread(() -> printer.print(1));
        Thread t2 = new Thread(() -> printer.print(2));
        Thread t3 = new Thread(() -> printer.print(3));

        t1.start();
        t2.start();
        t3.start();
    }
}
