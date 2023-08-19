package com.enh.java.generics.exercises;

import com.enh.java.generics.data.Stack;
import com.enh.java.generics.data.interfaces.StackInterface;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx1 {
    public static void main(String[] args) {
        
//         A -> Stack<Number> is the subclass of StackInterface<Number>, but not Stack<Integer> 
//         but can take the elements of sub-type of Number but not the class Stack<Integer> itself. See, below & above code :
        StackInterface<Number> stack = new Stack<>(new java.util.Stack<>());
        stack.push(1);
        stack.push(11.0);
        System.out.println(stack.getStack());
        
        List<StackInterface<Number>> stackList = new ArrayList<>();
        stackList.add(stack);
        
//        StackInterface<Number> stack2 = new Stack<Integer>(new java.util.Stack<>());
//        StackInterface<Number> stack3 = new Stack<Double>(new java.util.Stack<>());
    }
}
