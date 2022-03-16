package com.challenge;

import java.util.Stack;

public class StackChallenge {
	
	public static void main(String[] args) throws Exception {
		
		Stack<Object> stack = new Stack<Object>();
		stack_populate(stack);
		push(stack);
		max(stack);
		pop(stack);
		
	}

	
	public static void stack_populate(Stack<Object> stack) {
		stack.push(5);
		stack.push(9);
		stack.push("d");
		stack.push(7);
		stack.push("c");
		stack.push(5);
		System.out.println(stack);
	}
	
	public static void push(Stack<Object> stack) {
		stack.push("v");
		stack.push("a");
		stack.push(1);
		System.out.println(stack);
	}
	
	public static void pop(Stack<Object> stack) throws Exception {
		if(stack.empty()) {
			throw new Exception("Stack is Empty");
		}
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
	}
	
	public static void max(Stack<Object> stack) throws Exception {
		int a = 0;
		int b = 0;
		for(Object temp: stack) {
			if(stack.empty()) {
				throw new Exception("Stack is Empty");
			}
			if(temp instanceof Integer) {
				a = (int) temp;
				if(b == 0) {
					b = a;
				}
				else if(a>b) {
					b = a;
				}
			}
		}
			
		System.out.println(b);	
	}
	

}
