package threadss;
class MyThreadExample extends Thread {
//initiated run method for thread
    public void run() {
       String str = "Thread is running";
       System.out.println(str);
    }
}
public class MyThread {
    public static void main(String[] args) {
        MyThreadExample t1 = new MyThreadExample();
        t1.start();
    }
}
