package by.belhard.kids_pro.les7.threads;

public class MyThread extends Thread {

    private int a = 0;
    private int n;

    public MyThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        try {
            while (a < n) {
                System.out.println(this + " a=" + ++a);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }
        System.out.println("Thread " + this.toString() + " ends");
    }
}
