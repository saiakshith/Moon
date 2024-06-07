package com.enh.java.concurrency;

import static com.enh.java.util.PlaygroundUtil.log;

public class CountRunnable implements Runnable {
    private int count;
    
    @Override
    public void run() {
        for (int i = 0; i < 1_00_000; i++) {
            count++;
        }

        log("Thread Name : " + Thread.currentThread().getName() + " Count : " + count);
    }
}
