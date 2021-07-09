package com.tushar.string;

public class ReverseWord {

	public static void main(String[] args) {
		
		String reverseWord="";
		
		for (int i = args[0].length()-1; i >= 0; i--) {
			reverseWord = reverseWord + args[0].charAt(i);
		}
		System.out.print("Reverse word of "+args[0]+ " is "+reverseWord);
	}

}
