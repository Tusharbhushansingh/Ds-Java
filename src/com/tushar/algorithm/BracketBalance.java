package com.tushar.algorithm;

public class BracketBalance {

	public static void main(String[] args) throws Exception {

		String value = "{[]()}  ";
		int found = 1;
		MyLinkedList<String> myLL = new MyLinkedList<>();
		for (int i = 0; i < value.length(); i++) {
			if(value.substring(i,i+1).contentEquals("{") || value.substring(i,i+1).contentEquals("(") || value.substring(i,i+1).contentEquals("[")) {
				myLL.add(value.substring(i,i+1));
			}
			if(value.substring(i,i+1).contentEquals("}") || value.substring(i,i+1).contentEquals(")") || value.substring(i,i+1).contentEquals("]")) {
				if(!myLL.isEmpty()) {
					String peek = myLL.peek();
					String str = peek + value.substring(i,i+1);
					if (str.equalsIgnoreCase("()") || str.equalsIgnoreCase("{}") || str.equalsIgnoreCase("[]") ) {
							myLL.remove();
					}
				}
				else {
					found = 0;
				}
			}
		}
		myLL.print();
		if(myLL.isEmpty() && found == 1)
			System.out.println("Match");
		else
			System.out.println("Not Match");
	}

}
