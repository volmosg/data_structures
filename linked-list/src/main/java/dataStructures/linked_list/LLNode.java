package data.structures.java.linked_list;

public class LLNode<E> {
	
	// A node from a doubly linked list needs the information about the data itself,
	// a pointer to the next node and a pointer to the previous node
	E data;
	LLNode<E> prevNode;
	LLNode<E> nextNode;
	
	// This implementation uses sentinel nodes ("buffer" empty nodes at the head and tail of the list)
	public LLNode(E e){
		this.data = e;
		this.prevNode = null;
		this.nextNode = null;
	}

}
