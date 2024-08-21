package com.enh.java.concurrency;

import com.enh.java.concurrency.data.SimplePOJO;
import com.enh.java.util.PlaygroundUtil;

public class SimplePOJOThread extends Thread {

    public SimplePOJO simplePOJO = new SimplePOJO(); 
    
    @Override
    public void run() {
        PlaygroundUtil.log(simplePOJO);
    }
}
