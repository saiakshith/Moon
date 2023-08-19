package com.enh.java.generics.data.interfaces;

import java.util.Stack;

public interface StackInterface<E> {
    
    void push(E element);
    
    void pop();
    
    Stack<E> getStack();
    
    boolean isEmpty();
}
