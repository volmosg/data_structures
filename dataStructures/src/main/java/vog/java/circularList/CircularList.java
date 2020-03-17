package vog.java.circularList;

import java.util.AbstractList;

public class CircularList<E>{
	// singly circular list
	public int size;
	CircularNode<E> head;
	
	public CircularList(){
		size = 0;
		head = new CircularNode<E>(null);
	}
	
	/**
	 * insert element at the beginning of the list
	 * @param data
	 * @return
	 */
	public boolean insert(E data) {
		if (data == null) {
			throw new NullPointerException();
		}
		CircularNode<E> newNode = new CircularNode<E>(data);
		if (this.size == 0) {
			head = newNode;
			newNode.nextNode = head;
			size +=1;
			return true;
		}
		else {
			CircularNode<E> tempNode = head;
			// locate the "last" node, i.e. the one that has a pointer from the head
			while (!tempNode.nextNode.equals(head)) {
				tempNode = tempNode.nextNode;
			}
			// add new node
			tempNode.nextNode = newNode;
			newNode.nextNode = this.head;
			size += 1;
			return true;
		}
		
	}
	
	/**
	 * remove element at the beginning of the list
	 * @param index
	 * @return
	 */
	public void removeFirst() {
		if (this.size == 0) {
			throw new IndexOutOfBoundsException();
		}
		else if (head.nextNode.equals(head)) {
			this.head.data = null;
			this.head.nextNode = null;
			size -= 1;
		}
		else {
			CircularNode<E> tempNode = this.head;
			while (!tempNode.nextNode.equals(this.head)) {
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = this.head.nextNode;
			this.head.data = null;
			this.head.nextNode = null;
			this.head = tempNode.nextNode;
			size -= 1;
		}
		
	}
	
	/**
	 * obtain a string with the values of the list. Mainly for debugging
	 * @return
	 */
	public String display() {
		if (size == 0) {
			throw new IndexOutOfBoundsException();
		}
		else {
			StringBuffer sb = new StringBuffer();
			CircularNode<E> tempNode = this.head;
			while(!tempNode.nextNode.equals(this.head)) {
				sb.append(tempNode.data);
				tempNode = tempNode.nextNode;
			}
			sb.append(tempNode.data);
			return sb.toString();
		}
	}
	
	//TODO size
	public int size() {
		return this.size;
	}	
	

}
