package com.sh.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 1000; i++){
            System.out.println("MyThread" + i);
        }
    }
}
