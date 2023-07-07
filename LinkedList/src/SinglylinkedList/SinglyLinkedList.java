package SinglylinkedList;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class SinglyLinkedList {
	static class Node{

		private int data;
		private Node nextnode;
		public Node() {
			nextnode=null;
		}
		public Node(int data) {
			this.data = data;
			nextnode=null;
		}
		public Node(Node node , int data) {
			this.data = data;
			this.nextnode = node;
		}
		
	}
	private Node head;
	public SinglyLinkedList() {
	head=null;
	}
	
	//add at first postion
	void addatEnd(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
		}
		else {
			Node trav = head;
			while(trav.nextnode!=null) {
				trav = trav.nextnode;
			}
			trav.nextnode = node;
		}
		
	}
	// add at end
	void addatFirst(int data) {
		Node node = new Node(data);
		node.nextnode=head;
		head = node;
		
		
	}
	//at any Position
	void addanyposition(int index,int data) {
		if((head == null) || (index <=1)) 
			addatFirst(data);
		else {
			Node trav = head;
			Node node = new Node(data);
			for(int i=1 ;i<index-1;i++ ) {
				if(trav.nextnode ==null)
					break;
				trav=trav.nextnode;
			}
			node.nextnode = trav.nextnode;
			trav.nextnode=node;
		}
	}
	
	
	void show() {
		Node trav = head;
		while(trav!=null){
			System.out.print(trav.data+"-->");
			trav = trav.nextnode;
		}
		
		System.out.println("");
		
	}
	
	void deleteFirst(){
		if(head==null)
			throw new RuntimeException("Empty List");
		head = head.nextnode;
		
	}
	void deleteLast() {
		if(head==null)
			throw new RuntimeException("Empty List");
		if(head.nextnode==null)
			head=null;
		else {
		Node deletenode = null;
		Node trav= head;
		
		while(trav.nextnode!=null) {
			deletenode = trav;
			trav=trav.nextnode;
		}
		deletenode.nextnode = null;
		}
	}
	
	void deleteAsPos(int pos) {
	
		if(pos==1)
			deleteFirst();
		if((head == null) || pos<1)
			throw new RuntimeException("List is Empty or Invalid Position");
		else {
			Node trav = head;
		for(int i =1; i<pos-1;i++) {
			if(trav==null) {
				throw new RuntimeException("invalid Index");
			}
			trav=trav.nextnode;
		}
		Node next = trav.nextnode;
		trav.nextnode = next.nextnode;
		}
	}
	void deleteAll() {
		head = null;
		
	}
	
	public void reverselist() {
		Node oldhead = head;
		head = null;
		while(oldhead != null) {
			// delete first (temp) from old list
			Node temp = oldhead;
			oldhead = oldhead.nextnode;
			// add first (temp) to new list
			temp.nextnode = head;
			head = temp;
		} // repeat until old list is finished
	}
	public Node reverselist(Node h){
		if(h.nextnode==null) {
			head = h;
			return h;
		}
		
			Node t = reverselist(h.nextnode);
			t.nextnode = h;
			h.nextnode = null;
			return h;
			
		
	}
	
	
	public void recureverselist() {
		if(head!=null)
		reverselist(head);
	}
	
	void addatEnd(Node data) {
		//Node node = new Node(data);
		if(head==null) {
			head = data;
		}
		else {
			Node trav = head;
			while(trav.nextnode!=null) {
				trav = trav.nextnode;
			}
			trav.nextnode = data;
		}
		
	}
	
	

}


