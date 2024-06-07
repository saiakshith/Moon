package com.enh.java.concurrency.test;

import com.enh.java.concurrency.CountRunnable;

public class ConcurrencyTest {
    public static void main(String[] args) {
        CountRunnable countRunnable1 = new CountRunnable();
        CountRunnable countRunnable2 = new CountRunnable();
        
        Thread thread1 = new Thread(countRunnable1, "Thread-1");
        Thread thread2 = new Thread(countRunnable2, "Thread-2");
        
        thread1.start();
        thread2.start();
    }
}
