package com.enh.java.generics.data;

/*Write a generic class Stack<T> that can be used to represent stacks of objects of type T. 
        The class should include methods push(), pop(), and isEmpty(). 
        Inside the class, use an ArrayList to hold the items on the stack.*/

import com.enh.java.generics.data.interfaces.Collection;

import java.util.Objects;

public class Stack<E> implements Collection<E> {

    private java.util.Stack<E> stack;

    public Stack(java.util.Stack<E> stack) {
        this.stack = stack;
    }

    @Override
    public void push(E element) {
        stack.push(element);
    }

    @Override
    public void pop() {
        stack.pop();
    }

    @Override
    public java.util.Stack<E> getStack() {
        return stack;
    }

    @Override
    public boolean isEmpty() {
        return Objects.nonNull(stack) ? stack.isEmpty() : Boolean.FALSE;
    }
}
