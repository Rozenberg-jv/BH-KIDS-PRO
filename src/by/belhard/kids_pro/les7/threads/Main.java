package by.belhard.kids_pro.les7.threads;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start main");

        Thread thread1 = new MyThread(3);
        Thread thread2 = new MyThread(5);
        Thread thread3 = new MyThread(2);

//        thread1.run();
        thread1.start();
        thread2.start();
        thread3.start();


        System.out.println("End main");

    }
}
