package com.tushar.string;

public class ReverseString {

	public static void main(String[] args) {
		String words = "   My name is tushar  ";
		
		int i = words.length() - 1,j;
		String reverseString = "";
		while(i>0) {
			while(Character.isWhitespace(words.charAt(i)) && i!= 0)
				i--;
			j=i;
			while(!Character.isWhitespace(words.charAt(i)) && i!= 0)
					i--;
			if(i != 0)
				reverseString = reverseString + words.substring(i+1, j+1) +" ";	
			else
				reverseString = reverseString + words.substring(i,j+1);
		}
		System.out.print(reverseString);
	}

}
