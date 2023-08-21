package com.enh.java.generics.exercises.solutions;

import java.util.ArrayList;

public class Stack<T> {

	private ArrayList<T> stack;
	private int top;
	private int capacity;

	//to construct stack with given size
	public Stack(int size) {
		this.stack = new ArrayList<>();
		this.top = -1;
		this.capacity = size;
	}

	//to add element in stack
	public void push(T x) {
		if (top == capacity - 1) {
			throw new IllegalStateException("Stack Overflow!");
		}

		System.out.println("Inserting element" + x);
		top++;
		stack.add(x);
	}

	//to remove element
	public T pop() {
		if (top < 0) {
			throw new IllegalStateException("Stack is empty!");
		}

		int top = stack.size() - 1;
		return stack.remove(top);

	}

	//to peek top element
	public T peek() {
		if (!isEmpty())
			return stack.get(top);

		return null;
	}

	//to return the size of the stack
	public int size() {
		return top + 1;
	}

	//to check if the stack is empty or not
	public Boolean isEmpty() {
		return top == -1;
	}

}
