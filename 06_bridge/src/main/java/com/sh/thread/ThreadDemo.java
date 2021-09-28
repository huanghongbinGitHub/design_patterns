package com.sh.thread;

public class ThreadDemo {
    //

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Thread thread1 = new Thread(new MyRunable());
        thread1.start();

        sys();
    }

    public static void sys(){
        for(int i = 0; i < 1000; i++){
            System.out.println("MainThread " + i);
        }
    }



}
