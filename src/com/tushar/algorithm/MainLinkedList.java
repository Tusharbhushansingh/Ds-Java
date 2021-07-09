package com.tushar.algorithm;

public class MainLinkedList {

	public static void main(String[] args) throws Exception {
		
		MyLinkedList<String> myLL = new MyLinkedList<>();
		
		myLL.add("Ram");
		myLL.add("Shaym");

		myLL.print();
		
		String toremove = myLL.remove();
		System.out.println(toremove);
		
		System.out.println("\n");
		myLL.print();
		
		System.out.println("\n");
		myLL.add("Mohan");

		myLL.print();
		
		String top = myLL.peek();
		System.out.println("\n");
		System.out.println(top);
	}

}
