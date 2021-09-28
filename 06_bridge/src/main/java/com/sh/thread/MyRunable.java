package com.sh.thread;

public class MyRunable implements Runnable {

    public void run() {
        for(int i = 0; i < 1000; i++){
            System.out.println("MyRunable" + i);
        }
    }

}
