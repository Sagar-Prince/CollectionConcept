package com.nt.collection;

public class LinkListDataStructure {
	Node head;
	
	
	void add(int data) {
		Node node=new Node(data);
		
		if(head == null) {
			head=node;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data = data;
			next=null;
		}
	}
	public static void main(String[] args) {
		LinkListDataStructure ll=new LinkListDataStructure();
		ll.add(4);
		ll.add(9);
		ll.add(3);
		ll.add(1);
		
		ll.print();
		
	}
}
