package com.enh.java.generics.data.interfaces;

import java.util.Stack;

public interface Collection<E> {
    
    void push(E element);
    
    void pop();
    
    Stack<E> getStack();
    
    boolean isEmpty();
}
