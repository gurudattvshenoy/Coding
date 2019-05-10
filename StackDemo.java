package InterviewQuestion.questions;

import java.util.EmptyStackException;

public class StackDemo {
	int top = -1;
	int capacity;
	int [] array;
	public StackDemo(int capacity)
	{   this.capacity = capacity;
		this.array = new int[capacity];
	}
	
	public void push(int data)
	{
		if(isStackFull()) 
		{
			 throw new StackOverflowError("Stack is full, pop element to push something to it");
		}
		top = top + 1;
		this.array[top] = data;
		
	}
	
	
	public int pop() 
	{
		if(isStackEmpty()) {
			throw new EmptyStackException();
		}
		int old_top = top;
		top = top - 1;
		return this.array[old_top];
	}
	
	public boolean isStackFull() {
		if(this.capacity -1 == top )
			return true;
		return false;
	}
	
	public boolean isStackEmpty() 
	{
		if(top == -1) 
			return true;	
		return false;
	}
	
	
	public static void main(String []arr) 
	{
		StackDemo s = new StackDemo(3);
		try {
			//s.pop();
			s.push(10);
			s.push(11);
			s.push(33);
			s.push(66);
		} catch (StackOverflowError e) {
			e.printStackTrace();
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		System.out.println(s.pop());
	}
}
