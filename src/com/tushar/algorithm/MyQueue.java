package com.tushar.algorithm;

public class MyQueue<E> {

	Node<E> head;
	 
	public void offer(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	public E pull() throws Exception {
		if(head == null) {
			throw new Exception("Pull operation is not performed as Queue is empty");
		}
		Node<E> toremove = head;
		head = head.next;
		return (E) toremove.data;
		
	}
	
	public E peek() throws Exception {
		if(head == null) {
			throw new Exception("Pull operation is not performed as Queue is empty");
		}
		Node<E> topeek = head;
		return (E) topeek.data;
	}
	
	public void print() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
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
