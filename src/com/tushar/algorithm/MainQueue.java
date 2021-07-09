package com.tushar.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) throws Exception {
		//My Own Queue method and its implementations
		MyQueue<String> myQq = new MyQueue<>();
		myQq.offer("Ram");
		myQq.offer("Shyam");
		myQq.offer("Mohan");
		myQq.offer("Vinod");
		myQq.print();
		System.out.println("Pull operation:");
		String pullVar = myQq.pull();
		System.out.println("pull variable is: "+pullVar+ "\n");
		String peekvar = myQq.peek();
		System.out.println("peek variable is: "+peekvar+ "\n");
		myQq.print();
	
		//Collection framework Queue implementations
		Queue<String> mm = new LinkedList<>();
		mm.offer("Ram");
		mm.offer("Shyam");
		mm.offer("Mohan");
		mm.offer("Vinod");
		String pullVar1 = mm.poll();
		System.out.println("pull variable is: "+pullVar1+ "\n");
		String peekvar1 = mm.peek();
		System.out.println("peek variable is: "+peekvar1+ "\n");
		
		}
	}
	

