package com.tushar.algorithm;

//Example of own created linked list
public class MyLinkedList<E> {

	Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd = new Node<>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public E remove() throws Exception {
		Node<E> temp = head;
		
		if(temp == null)
			throw new Exception("Cannot remove the element from the empty stack");
		
		if(temp.next == null) {
			Node<E> toremove = head;
			head = null;
			return (E) toremove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toremove = temp.next;
		temp.next = null;
		return (E) toremove.data;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public E peek() {
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		return (E) temp.data;
	}
	

	static class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}
}
