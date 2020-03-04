package data.structures.java.linked_list;

public class ImpLinkedList<E> {
	
	// doubly linked list
	// minimum unit is node
	// TODO Constructor
	LLNode<E> head;
	LLNode<E> tail;
	int size;
	
	public ImpLinkedList() {
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		size = 0;
		head.nextNode = tail;
		tail.prevNode = head;
	}
	
	//TODO author methods
	
	//TODO add
	
	//TODO get
	
	//TODO add (given an index)
	
	//TODO remove
	
	//TODO set
	

}
